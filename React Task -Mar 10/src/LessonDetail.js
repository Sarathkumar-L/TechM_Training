
import React from 'react';

function LessonDetail({ lesson }) {
  return (
    <div className="card mt-3">
      <div className="card-body">
        <h5 className="card-title">{lesson.title}</h5>
        <p className="card-text">{lesson.content}</p>
        <div className="embed-responsive embed-responsive-16by9">
          <iframe
            className="embed-responsive-item"
            src={`https://www.youtube.com/embed/${lesson.videoId}`}
            allowFullScreen
            title={lesson.title}
          ></iframe>
        </div>
      </div>
    </div>
  );
}

export default LessonDetail;