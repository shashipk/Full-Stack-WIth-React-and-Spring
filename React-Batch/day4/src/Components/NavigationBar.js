import React from "react";
import {Link} from "react-router-dom";

export default function NavigationBar(){
    return(
        <div className="nav-bar">
            <Link to="/" className="nav-item"> Home </Link>
            <Link to="/about" className="nav-item"> About </Link>
            <Link to="/contact" className="nav-item"> Contact US </Link>
            <Link to="/users" className="nav-item"> Users </Link>
        </div>
    );
}