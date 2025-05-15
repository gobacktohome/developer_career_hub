import React, { useEffect, useState } from 'react';
import axios from 'axios';

function JobsList() {
  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/jobs')
      .then(response => {
        setJobs(response.data);
      })
      .catch(error => {
        console.error('Error fetching jobs:', error);
      });
  }, []);

  return (
    <div>
      <h2>Jobs List</h2>
      <ul>
        {jobs.map((job, index) => (
          <li key={index}>
            {job.companyName} - {job.jobTitle}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default JobsList;
