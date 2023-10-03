package hrms.demo.business.abstracts;

import java.util.List;

import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.Employer;


public interface EmployerService {

	DataResult<List<Employer>> getAll(); 
	Result add(Employer employer);
	
}
