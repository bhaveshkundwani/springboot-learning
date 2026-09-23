import React from "react";

import {
  AppBar,
  Toolbar,
  Box,
  Typography,
  Button,
} from "@mui/material";

import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar
        position="static"
        sx={{
          backgroundColor: "#ADD8E6",
        }}
      >
        <Toolbar>
          <Typography
            variant="h4"
            component="div"
            sx={{
              flexGrow: 1,
              fontFamily: "revert",
              color: "black",
            }}
          >
            Job Portal
          </Typography>

          <Box sx={{ m: 0.5 }}>
            <Button
              variant="outlined"
              component={Link}
              to="/"
              sx={{ color: "black" }}
            >
              Home
            </Button>
          </Box>

          <Box sx={{ m: 0.5 }}>
            <Button
              variant="outlined"
              component={Link}
              to="/create"
              sx={{ color: "black" }}
            >
              Add Job
            </Button>
          </Box>

          <Box sx={{ m: 0.5 }}>
            <Button
              variant="outlined"
              href="https://telusko.com/"
              target="_blank"
              sx={{ color: "black" }}
            >
              Contact Us
            </Button>
          </Box>
        </Toolbar>
      </AppBar>
    </Box>
  );
};

export default Navbar;