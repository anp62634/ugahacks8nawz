import React, { useState } from 'react'
import { Link, useNavigate } from "react-router-dom";
import "./Form.css"

export default function Register() {
    return (
        <div className='formParent'>
            <h2 className="formTitle">Register</h2>
            <form>
                <label>First Name</label>
                <input 
                name = "firstName"
                type = "text"
                placeholder='First name'
                />
                 <label>Last Name</label>
                <input 
                name = "lastName"
                type = "text"
                placeholder='Last name'
                />
                 <label>Email</label>
                <input 
                name = "email"
                type = "text"
                placeholder='Email'
                />
                <label>Username</label>
                <input 
                name = "username"
                type = "text"
                placeholder='Username'
                />
                <label>Password</label>
                <input 
                name = "opassword"
                type = "text"
                placeholder='Password'
                />
                <input type="submit" value="Register" className='button'></input>
            </form>
        </div>
    )
}
