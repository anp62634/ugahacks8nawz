import React, {useState} from "react"
import { useNavigate } from "react-router-dom"
import "./Form.css"

export default function Login() {
    return (
        <div className="formParent">
        <h2 className="formTitle">Log In</h2>
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
        <input type="submit" value="Log In" className="button"></input>
        </div>
    )
}