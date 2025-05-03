import React from "react";
import CourseCard from "./components/CourseCard";

const course = {
  id: 101,
  title: "React for Beginners",
  description: "Learn the basics of React.js in this beginner course.",
  price: 49,
};

const App = () => {
  return (
    <div className="flex justify-center items-center min-h-screen bg-gray-100">
      <CourseCard course={course} />
    </div>
  );
};

export default App;
