package hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.demo.business.abstracts.UserService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.dataAccess.abstracts.UserDao;
import hrms.demo.entities.concretes.User;

@Service
public class UserManager implements UserService {

	 private  UserDao userDao;

	    @Autowired
	    public UserManager(UserDao userDao) {
	        super();
	    	this.userDao = userDao;
	    }


	    
	    @Override
	    public Result add(User user) {
	        this.userDao.save(user);
	        return new SuccessResult("User Eklendi");
	    }
	    
	    @Override
	    public DataResult<List<User>> getAll() {
	        return new SuccessDataResult<List<User>>(this.userDao.findAll(), "User Listesi : ");
	    }
	   
	    


	   
}
