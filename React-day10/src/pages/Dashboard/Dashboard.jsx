import React from 'react'
import { Outlet } from 'react-router-dom';
import Navbar from '../../components/Navbar/Navbar';
const Dashboard = ({setIsAuthenticated}) => {
  return (
    <div>
        <h2>Dashboard</h2>
        
        <Navbar setIsAuthenticated={setIsAuthenticated}/>

        <Outlet/>
    </div>
  )
}

export default Dashboard