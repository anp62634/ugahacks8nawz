import React, { useEffect, useState } from "react";
import { NavLink } from "react-router-dom";
import "./NavBar.css"

const NavBar = () => {
    return (
        <nav className="navbar">
            <ul className="list">
                <li className="item">
                    <NavLink
                        className="link"
                        to="/"
                    >
                        Home
                    </NavLink>
                </li>

                <li className="item">
                    <NavLink
                        className="link"
                        to="/login"
                    >
                        Log In
                    </NavLink>
                </li>
                <li className="item">
                    <NavLink
                        className="link"
                        to="/register"
                    >
                        Register
                    </NavLink>
                </li>
                <li className="item">
                    <NavLink
                        className="link"
                        to="/parks"
                    >
                        Parks
                    </NavLink>
                </li>
            </ul>
        </nav>
    );
};
export default NavBar;