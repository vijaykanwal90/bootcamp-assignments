import React, { useEffect, useState } from "react";

const DigitalClock = () => {
  const currentDate = new Date();
  const [time, setTime] = useState({
    hour: currentDate.getHours(),
    minutes: currentDate.getMinutes(),
    seconds: currentDate.getSeconds(),
  });

  useEffect(() => {
    const interval = setInterval(() => {
    const current = new Date();

      setTime({
        hour: current.getHours(),
        minutes: current.getMinutes(),
        seconds: current.getSeconds(),
      });
    }, 1000);
  
    return ()=> clearInterval(interval);
  }, []);
  const formatTime = (time)=> time <10 ? `0${time}` : `${time}`
  return (
    <div>
      <h2>DigitalClock</h2>
      <div>
        <span>{formatTime(time.hour)} hours</span>
        &nbsp;
        &nbsp; 
        <span>{formatTime(time.minutes)} minutes</span>
        &nbsp;
        &nbsp;

        <span>{formatTime(time.seconds)} seconds</span>
      </div>
    </div>
  );
};

export default DigitalClock;
