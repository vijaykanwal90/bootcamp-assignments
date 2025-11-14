import DigitalClock from './components/DigitalClock';
import Dashboard from './pages/Dashboard';
import Counter from './components/Counter';
import Login from './pages/Login';
import PageNotFound from './pages/PageNotFound';
import ProtectedRoute from './components/ProtectedRoute';
import {Routes,Route,useNavigate} from 'react-router-dom';
import { useEffect, useState} from "react"
function App() {
    const [isAuthenticated,setIsAuthenticated] = useState(false);
    const navigate = useNavigate()
    const handleLogin = ()=>{
        localStorage.setItem("isAuthenticated","true");
        setIsAuthenticated(true)
        navigate('/')
    }
    useEffect(()=>{
      
         
      let token =  localStorage.getItem('isAuthenticated')
     
      if(token==='true'){
        setIsAuthenticated(true)
        navigate('/')
      }
      
    },[])
  return (
    <>
       <Routes>
            <Route  path="/" element={<ProtectedRoute isAuthenticated={isAuthenticated} setIsAuthenticated={setIsAuthenticated}> <Dashboard setIsAuthenticated={setIsAuthenticated}/></ProtectedRoute>}>
            
              <Route  path="counter" element={<Counter/>}/>
              <Route  path="clock" element={<DigitalClock/>}/>
            </Route>
            <Route path='login' element={<Login isAuthenticated={isAuthenticated} handleLogin={handleLogin}/>}></Route>
            <Route path='*' element={<PageNotFound/>}></Route>

       </Routes>
      
    </>
  )
}

export default App
