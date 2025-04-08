
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import CourseList from './CourseList';
import LessonList from './LessonList';
import './index.css'; 

function App() {
  const [courses, setCourses] = useState([]);
  const [selectedCourse, setSelectedCourse] = useState(null);
  const [lessons, setLessons] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:4500/courses')
      .then(response => setCourses(response.data))
      .catch(error => console.error('Error fetching courses:', error));
  }, []);

  const selectCourse = (course) => {
    setSelectedCourse(course);
    axios.get(`http://localhost:4500/lessons?courseId=${course.id}`)
      .then(response => setLessons(response.data))
      .catch(error => console.error('Error fetching lessons:', error));
  };

  return (
    <div className="bg-custom">
      <div className="container">
        <h1 className="my-4 text-center header-text">Online Learning Platform</h1>
        <div className="row">
          <div className="col-md-4">
            <CourseList courses={courses} onSelectCourse={selectCourse} />
          </div>
          <div className="col-md-8">
            {selectedCourse && <LessonList lessons={lessons} />}
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;