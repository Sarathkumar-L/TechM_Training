
import React, { useState } from 'react';

function LessonDetail({ lesson }) {
  const [comment, setComment] = useState('');
  const [comments, setComments] = useState([]);

  const handleCommentSubmit = (e) => {
    e.preventDefault();
    if (comment.trim()) {
      setComments([...comments, comment]);
      setComment('');
    }
  };

  return (
    <div className="card mt-3">
      <div className="card-body">
        <h5 className="card-title">{lesson.title}</h5>
        <p className="card-text">{lesson.content}</p>
        <div className="embed-responsive embed-responsive-16by9 mb-3">
          <iframe
            className="embed-responsive-item"
            src={`https://www.youtube.com/embed/${lesson.videoId}`}
            allowFullScreen
            title={lesson.title}
          ></iframe>
        </div>
        <form onSubmit={handleCommentSubmit}>
          <div className="input-group mb-3">
            <input
              type="text"
              className="form-control"
              value={comment}
              onChange={(e) => setComment(e.target.value)}
              placeholder="Add a comment"
            />
            <button type="submit" className="btn btn-primary">Submit</button>
          </div>
        </form>
        <ul className="list-group">
          {comments.map((cmt, index) => (
            <li key={index} className="list-group-item">{cmt}</li>
          ))}
        </ul>
      </div>
    </div>
  );
}

export default LessonDetail;
