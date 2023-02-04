import React, {useState} from "react"
import {Link, useNavigate} from "react-router-dom"

export default function Login() {
    return (
        <div className="loginParent">
        <h2>Log In</h2>
        <form>
            <label>Username</label>
            <input
            name="username"
            type="text"
            />
            <label>Password</label>
            <input
            name="password"
            type="text"
            />
        </form>
        </div>
    )
}