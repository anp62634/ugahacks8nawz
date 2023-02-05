import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Parks.css"

function Parks() {
    return (
        <div className="parksParent">
            <h2 className="formTitle">Parks</h2>
            <form className="searchBar">
                <input
                    name="search"
                    placeholder="Search for parks"
                />
                <input type="submit" value="Search" className="button"/>
            </form>
            <br></br>
            <h3>Search Results</h3>
            <div className="searchBox"></div>
            <br></br>
            <br></br>
            <br></br>
            <br></br>
            <h3>Your Parks</h3>
            <div className="savedBox"></div>
        </div>
    )
}

export default Parks;