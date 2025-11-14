
import Dashboard from '../pages/Dashboard';
import { Navigate } from 'react-router-dom';
import { useEffect } from 'react';
const ProtectedRoute = ({isAuthenticated}) => {
    useEffect(()=>{
        if(!isAuthenticated){
    

            <Navigate to="/login"/>
        }
    },[isAuthenticated])
    // const isAuthenticated = localStorage.getItem('isAuthenticated')

  return isAuthenticated ? <Dashboard/> : <Navigate to="/login" />

}

export default ProtectedRoute