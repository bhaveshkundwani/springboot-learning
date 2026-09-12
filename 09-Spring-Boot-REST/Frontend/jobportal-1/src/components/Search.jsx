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
} from "@mui/material";
import axios from "axios";

const Search = () => {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    const fetchInitialPosts = async () => {
      try {
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

    fetchInitialPosts();
  }, []);

  return (
    <>
      {/* Navbar */}
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

      {/* Main Content */}
      <Box
        sx={{
          minHeight: "100vh",
          backgroundColor: "#f5f7fa",
          py: 5,
        }}
      >
        <Container maxWidth="xl">
          {/* Page Heading */}
          <Box
            sx={{
              textAlign: "center",
              mb: 5,
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

          {/* Loading */}
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

          {/* Error */}
          {error && (
            <Alert severity="error">
              {error}
            </Alert>
          )}

          {/* Job Cards */}
          {!loading && !error && (
            <>
              {posts.length > 0 ? (

                <Box
                  sx={{
                    display: "grid",

                    gridTemplateColumns: {
                      xs: "1fr",
                      sm: "repeat(2, minmax(0, 1fr))",
                    },

                    gap: 3,
                  }}
                >
                  {posts.map((p) => (
                    <Card
                      key={p.id}
                      sx={{
                        height: "100%",
                        width: "100%",
                        borderRadius: 3,
                        transition: "0.3s",
                        boxShadow: 3,

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
                        {/* Job Title */}
                        <Typography
                          variant="h5"
                          sx={{
                            fontWeight: 700,
                            mb: 2,
                          }}
                        >
                          {p.postProfile}
                        </Typography>

                        {/* Description */}
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

                        {/* Experience */}
                        <Typography
                          variant="h6"
                          sx={{
                            fontWeight: 600,
                            mb: 2,
                          }}
                        >
                          Experience: {p.reqExperience} years
                        </Typography>

                        {/* Skills Heading */}
                        <Typography
                          variant="subtitle1"
                          sx={{
                            fontWeight: 600,
                            mb: 1,
                          }}
                        >
                          Required Skills
                        </Typography>

                        {/* Skills */}
                        <Box
                          sx={{
                            display: "flex",
                            flexWrap: "wrap",
                            gap: 1,
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