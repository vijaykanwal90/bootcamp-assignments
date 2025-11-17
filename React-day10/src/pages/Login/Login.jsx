import { useNavigate } from 'react-router-dom';
import { useEffect } from 'react';
const Login = ({handleLogin,isAuthenticated}) => {
  const navigate= useNavigate()
    useEffect(() => {
    if (isAuthenticated) {
      navigate("/dashboard");
    }
  }, [isAuthenticated, navigate]);
  return (
    <div className='login'>
       <h2>Login Page</h2>
        <button onClick={handleLogin}>Login</button>
    </div>
  )
}

export default Login