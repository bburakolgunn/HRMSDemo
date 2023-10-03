package hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.demo.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
