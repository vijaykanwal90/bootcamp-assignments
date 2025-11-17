import DigitalClock from "./components/DigitalClock/DigitalClock";
import Dashboard from "./pages/Dashboard/Dashboard";
import Counter from "./components/Counter/Counter";
import Login from "./pages/Login/Login";
import "./App.css"
import PageNotFound from "./pages/PageNotFound/PageNotFound";
import Home from "./pages/Home/Home";
import ProtectedRoute from "./components/ProtectedRoute";
import { Routes, Route, useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
function App() {
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const navigate = useNavigate();
  const handleLogin = () => {
    localStorage.setItem("isAuthenticated", "true");
    setIsAuthenticated(true);
    navigate("/dashboard");
  };
  useEffect(() => {
    const token = localStorage.getItem("isAuthenticated");
    if (token === "true") {
      setIsAuthenticated(true);
    }
  }, []);

  return (
    <>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        {/* protected Routes */}
        <Route element={<ProtectedRoute isAuthenticated={isAuthenticated} />}>
          <Route
            path="/dashboard"
            element={<Dashboard setIsAuthenticated={setIsAuthenticated} />}
          >
          <Route  path="/dashboard/counter" element={<Counter />} />
          <Route path="/dashboard/clock" element={<DigitalClock />} />
          </Route>
        </Route>
        <Route
          path="login"
          element={
            <Login
              isAuthenticated={isAuthenticated}
              handleLogin={handleLogin}
            />
          }
        ></Route>
        <Route path="*" element={<PageNotFound />}></Route>
      </Routes>
    </>
  );
}

export default App;
