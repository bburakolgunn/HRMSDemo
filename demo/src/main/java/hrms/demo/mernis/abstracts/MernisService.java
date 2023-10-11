package hrms.demo.mernis.abstracts;



import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.JobSeeker;

public interface MernisService {
	
	public Result CheckPerson(JobSeeker seeker) throws Exception;

}
