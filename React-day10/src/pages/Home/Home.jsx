import React from "react";
import { Link } from "react-router-dom";
const Home = () => {
  return (
    <div>
      <ul className="navbar-list">
        <li><Link to="/login" className="links">Login</Link></li>
        <li> <Link to="/dashboard" className="links">Dashboard</Link></li>
      </ul>
      <div>
        This is home page of React application 
      </div>
    </div>
  );
};

export default Home;
