import React, { useEffect, useState } from "react";

import {
  AppBar,
  Toolbar,
  Box,
  Card,
  CardContent,
  Typography,
  Container,
  Chip,
  CircularProgress,
  Alert,
  TextField,
  InputAdornment,
  IconButton,
} from "@mui/material";

import DeleteIcon from "@mui/icons-material/Delete";
import EditIcon from "@mui/icons-material/Edit";
import SearchIcon from "@mui/icons-material/Search";

import axios from "axios";
import { useNavigate } from "react-router-dom";

const Search = () => {
  const [query, setQuery] = useState("");
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  const navigate = useNavigate();

  // =========================
  // Fetch all job posts
  // =========================
  const fetchInitialPosts = async () => {
    try {
      setLoading(true);
      setError("");

      const response = await axios.get(
        "http://localhost:8080/jobPosts"
      );

      console.log(response.data);
      setPosts(response.data);
    } catch (error) {
      console.error(error);
      setError("Unable to load job posts. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  // =========================
  // Search job posts
  // =========================
  const fetchPosts = async (searchQuery) => {
    try {
      setLoading(true);
      setError("");

      const response = await axios.get(
        `http://localhost:8080/jobPosts/keyword/${searchQuery}`
      );

      console.log(response.data);
      setPosts(response.data);
    } catch (error) {
      console.error(error);
      setError("Unable to search job posts. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  // =========================
  // Initial load + search
  // =========================
  useEffect(() => {
    if (query.length === 0) {
      fetchInitialPosts();
    } else if (query.length > 2) {
      fetchPosts(query);
    }
  }, [query]);

  // =========================
  // Edit job
  // =========================
  const handleEdit = (id) => {
    navigate("/edit", {
      state: {
        id: id,
      },
    });
  };

  // =========================
  // Delete job
  // =========================
  const handleDelete = async (id) => {
    try {
      await axios.delete(
        `http://localhost:8080/jobPost/${id}`
      );

      // Remove deleted post from current list
      setPosts((prevPosts) =>
        prevPosts.filter((post) => post.postId !== id)
      );
    } catch (error) {
      console.error(error);
      setError("Unable to delete job post. Please try again.");
    }
  };

  return (
    <>
      {/* =========================
          Navbar
      ========================== */}
      <AppBar position="static" elevation={2}>
        <Toolbar>
          <Typography
            variant="h5"
            component="div"
            sx={{
              flexGrow: 1,
              fontWeight: 600,
              textAlign: "center",
            }}
          >
            Job Portal
          </Typography>
        </Toolbar>
      </AppBar>

      {/* =========================
          Main Content
      ========================== */}
      <Box
        sx={{
          minHeight: "100vh",
          backgroundColor: "#f5f7fa",
          py: 5,
        }}
      >
        <Container maxWidth="xl">

          {/* =========================
              Page Heading
          ========================== */}
          <Box
            sx={{
              textAlign: "center",
              mb: 4,
            }}
          >
            <Typography
              variant="h4"
              sx={{
                fontWeight: 700,
                mb: 1,
              }}
            >
              Available Job Opportunities
            </Typography>

            <Typography
              variant="body1"
              sx={{
                color: "text.secondary",
              }}
            >
              Explore available jobs and find the right opportunity for you.
            </Typography>
          </Box>

          {/* =========================
              Search Box
          ========================== */}
          <Box
            sx={{
              display: "flex",
              justifyContent: "center",
              mb: 5,
            }}
          >
            <TextField
              fullWidth
              placeholder="Search jobs..."
              value={query}
              onChange={(e) => setQuery(e.target.value)}
              sx={{
                maxWidth: "800px",
                backgroundColor: "white",
                borderRadius: 1,
              }}
              InputProps={{
                startAdornment: (
                  <InputAdornment position="start">
                    <SearchIcon />
                  </InputAdornment>
                ),
              }}
            />
          </Box>

          {/* =========================
              Loading
          ========================== */}
          {loading && (
            <Box
              sx={{
                display: "flex",
                justifyContent: "center",
                mt: 5,
              }}
            >
              <CircularProgress />
            </Box>
          )}

          {/* =========================
              Error
          ========================== */}
          {error && (
            <Alert
              severity="error"
              sx={{ mb: 3 }}
            >
              {error}
            </Alert>
          )}

          {/* =========================
              Job Cards
          ========================== */}
          {!loading && !error && (
            <>
              {posts.length > 0 ? (
                <Box
                  sx={{
                    display: "grid",
                    gridTemplateColumns: {
                      xs: "1fr",
                      sm: "repeat(2, minmax(0, 1fr))",
                      md: "repeat(3, minmax(0, 1fr))",
                    },
                    gap: 3,
                  }}
                >
                  {posts.map((p) => (
                    <Card
                      key={p.postId}
                      sx={{
                        height: "100%",
                        width: "100%",
                        borderRadius: 3,
                        transition: "0.3s",
                        boxShadow: 3,
                        backgroundColor: "#ADD8E6",

                        "&:hover": {
                          transform: "translateY(-5px)",
                          boxShadow: 6,
                        },
                      }}
                    >
                      <CardContent
                        sx={{
                          p: 3,
                        }}
                      >

                        {/* =========================
                            Job Title
                        ========================== */}
                        <Typography
                          variant="h5"
                          sx={{
                            fontWeight: 700,
                            mb: 2,
                          }}
                        >
                          {p.postProfile}
                        </Typography>

                        {/* =========================
                            Description
                        ========================== */}
                        <Typography
                          variant="body1"
                          sx={{
                            color: "text.secondary",
                            mb: 3,
                          }}
                        >
                          <strong>Description:</strong>{" "}
                          {p.postDesc}
                        </Typography>

                        {/* =========================
                            Experience
                        ========================== */}
                        <Typography
                          variant="h6"
                          sx={{
                            fontWeight: 600,
                            mb: 2,
                          }}
                        >
                          Experience: {p.reqExperience} years
                        </Typography>

                        {/* =========================
                            Skills Heading
                        ========================== */}
                        <Typography
                          variant="subtitle1"
                          sx={{
                            fontWeight: 600,
                            mb: 1,
                          }}
                        >
                          Required Skills
                        </Typography>

                        {/* =========================
                            Skills
                        ========================== */}
                        <Box
                          sx={{
                            display: "flex",
                            flexWrap: "wrap",
                            gap: 1,
                            mb: 3,
                          }}
                        >
                          {p.postTechStack?.map(
                            (skill, index) => (
                              <Chip
                                key={index}
                                label={skill}
                                variant="outlined"
                                color="primary"
                              />
                            )
                          )}
                        </Box>

                        {/* =========================
                            Edit & Delete Buttons
                        ========================== */}
                        <Box
                          sx={{
                            display: "flex",
                            justifyContent: "flex-end",
                            gap: 1,
                          }}
                        >
                          <IconButton
                            color="primary"
                            onClick={() =>
                              handleEdit(p.postId)
                            }
                          >
                            <EditIcon />
                          </IconButton>

                          <IconButton
                            color="error"
                            onClick={() =>
                              handleDelete(p.postId)
                            }
                          >
                            <DeleteIcon />
                          </IconButton>
                        </Box>

                      </CardContent>
                    </Card>
                  ))}
                </Box>
              ) : (
                <Alert severity="info">
                  No job posts available.
                </Alert>
              )}
            </>
          )}

        </Container>
      </Box>
    </>
  );
};

export default Search;