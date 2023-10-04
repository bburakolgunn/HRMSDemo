package hrms.demo.mernis.abstracts;

import java.rmi.RemoteException;

import hrms.demo.entities.concretes.JobSeeker;

public interface MernisService {
	
	public boolean RealPerson(JobSeeker seeker) throws NumberFormatException, RemoteException;

}
