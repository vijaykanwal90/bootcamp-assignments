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
    <div className='navbar'>
        <ul className='navbar-list'>
            <li className='navbar-list-item'> <Link className='navbar-list-item-link' to="/dashboard/counter">Counter</Link></li>
            <li className='navbar-list-item'><Link className='navbar-list-item-link' to="/dashboard/clock">Clock</Link></li>
            <li className='navbar-list-item'>
            <button  onClick={handleLogout}>Logout</button>
            </li>
        </ul>
    </div>
  )
}

export default Navbar

