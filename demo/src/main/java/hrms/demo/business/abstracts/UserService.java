package hrms.demo.business.abstracts;

import java.util.List;

import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.User;


public interface UserService {

	DataResult<List<User>> getAll(); 
	Result add(User user);

}