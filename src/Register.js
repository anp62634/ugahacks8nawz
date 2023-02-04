import React, { useState } from 'react'
import { Link, useNavigate } from "react-router-dom";

export default function Register() {
    return (
        <div className='registerParent'>
            <h2>Register</h2>
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
                <input type="submit" value="Register"></input>
            </form>
        </div>
    )
}
