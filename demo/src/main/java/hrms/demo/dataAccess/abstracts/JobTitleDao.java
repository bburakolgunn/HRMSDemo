package hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.demo.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
