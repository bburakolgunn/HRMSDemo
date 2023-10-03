package hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.demo.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	
}
