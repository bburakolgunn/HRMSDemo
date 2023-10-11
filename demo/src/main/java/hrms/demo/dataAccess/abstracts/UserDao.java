package hrms.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hrms.demo.entities.concretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
