import React from 'react';
import ReactDOM from 'react-dom/client';

const students = [
  { id: 1, name: 'Sanjeev Sharma', department: 'Computer Science' },
  { id: 2, name: 'Sri Verma', department: 'Electronics' },
  { id: 3, name: 'monoj Kumar', department: 'Mechanical' },
  { id: 4, name: 'Shreyas Iyer', department: 'Civil' },
  { id: 5, name: 'Arjun Das', department: 'Electrical' }
];

function StudentList() {
  return (
    <div>
      <h1>Student List</h1>
      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
          </tr>
        </thead>
        <tbody>
          {students.map((student) => (
            <tr key={student.id}>
              <td>{student.id}</td>
              <td>{student.name}</td>
              <td>{student.department}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

const root = ReactDOM.createRoot(document.getElementById('sk'));
root.render(<StudentList />);
