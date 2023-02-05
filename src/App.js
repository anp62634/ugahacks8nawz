import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import "./App.css";
import Home from "./Home"
import Login from "./Login"
import NavBar from "./NavBar"
import Register from "./Register"
import Parks from "./Parks";

function App() {
  return (
    <div className="App">
      <Router>
      <NavBar />
        <Routes>
          <Route exact path="/" element={<Home />} />
          <Route exact path="/login" element={<Login />} />
          <Route exact path="/register" element={<Register />} />
          <Route exact path="/parks" element={<Parks />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
