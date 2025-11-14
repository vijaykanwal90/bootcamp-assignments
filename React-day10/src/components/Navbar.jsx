import React from 'react'
import { Link ,useNavigate} from 'react-router-dom'
const Navbar = ({setIsAuthenticated}) => {
  const navigate = useNavigate()
  const handleLogout = ()=>{
    localStorage.removeItem('isAuthenticated')
    navigate('/login')
    setIsAuthenticated(false)
  }
  return (
    <div>
        <ul>
            <li> <Link to="/counter">Counter</Link></li>
            <li><Link to="/clock">Clock</Link></li>
            <button onClick={handleLogout}>Logout</button>
        </ul>
    </div>
  )
}

export default Navbar

