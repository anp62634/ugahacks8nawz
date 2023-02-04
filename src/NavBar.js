import React, { useEffect, useState } from "react";
import { NavLink } from "react-router-dom";

const NavBar = () => {
    return (
        <nav className="navbar">
            <ul className="nav">
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
            </ul>
        </nav>
    );
};
export default NavBar;