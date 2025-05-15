import React from "react";
import EnrollmentService from "../services/EnrollmentService";

const CourseCard = ({ course }) => {
  const handleEnroll = async () => {
    const result = await EnrollmentService.enrollInCourse(course);
    alert(result ? "Enrollment successful!" : "Enrollment failed.");
  };

  return (
    <div className="p-4 border rounded-lg shadow-md w-64">
      <h2 className="text-xl font-bold mb-2">{course.title}</h2>
      <p className="mb-2">{course.description}</p>
      <p className="text-sm mb-4">Price: ${course.price}</p>
      <button
        onClick={handleEnroll}
        className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700"
      >
        Enroll
      </button>
    </div>
  );
};

export default CourseCard;
