package hrms.demo.verification.abstracts;

import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.JobSeeker;

public interface VerificationService {
	
	Result RealPerson(JobSeeker seeker);
	
	

}
