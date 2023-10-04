package hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hrms.demo.entities.concretes.JobSeeker;


@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	
	
}
