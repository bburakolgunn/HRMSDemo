package hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.demo.business.abstracts.EmployerService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.ErrorResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.core.utilities.validator.PasswordControl;
import hrms.demo.dataAccess.abstracts.EmployerDao;
import hrms.demo.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	

	@Override
	public Result add(Employer employer) {
		
		Result result = PasswordControl.control(employer.getPassword(), employer.getAgainpassword());
		if(!result.isSuccess()) {
			return new ErrorResult(result.getMessage());
			}
		
		
		
		
		this.employerDao.save(employer);
		return new SuccessResult("İşveren eklendi");
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data eklendi");
	}
	
}
