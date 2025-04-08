
import React from 'react';

function CourseList({ courses, onSelectCourse }) {
  return (
    <div className="card">
      <div className="card-header">Courses</div>
      <ul className="list-group list-group-flush">
        {courses.map(course => (
          <li
            key={course.id}
            className="list-group-item list-group-item-action"
            onClick={() => onSelectCourse(course)}
          >
            {course.name}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default CourseList;