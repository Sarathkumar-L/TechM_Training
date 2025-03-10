
import React, { useState } from 'react';
import LessonDetail from './LessonDetail';

function LessonList({ lessons }) {
  const [selectedLesson, setSelectedLesson] = useState(null);

  return (
    <div className="card">
      <div className="card-header">Lessons</div>
      <ul className="list-group list-group-flush">
        {lessons.map(lesson => (
          <li
            key={lesson.id}
            className="list-group-item list-group-item-action"
            onClick={() => setSelectedLesson(lesson)}
          >
            {lesson.title}
          </li>
        ))}
      </ul>
      {selectedLesson && <LessonDetail lesson={selectedLesson} />}
    </div>
  );
}

export default LessonList;