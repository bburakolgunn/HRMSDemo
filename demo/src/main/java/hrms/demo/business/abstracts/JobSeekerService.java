package hrms.demo.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;

import hrms.demo.entities.concretes.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll(); 
	Result add(JobSeeker seeker) throws NumberFormatException, RemoteException ;
}
