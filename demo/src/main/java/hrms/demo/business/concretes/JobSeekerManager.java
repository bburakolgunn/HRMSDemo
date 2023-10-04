package hrms.demo.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.demo.business.abstracts.JobSeekerService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.ErrorResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.dataAccess.abstracts.JobSeekerDao;
import hrms.demo.entities.concretes.JobSeeker;
import hrms.demo.mernis.abstracts.MernisService;


@Service
public class JobSeekerManager implements JobSeekerService  {

	
	private JobSeekerDao seekerDao;
	private MernisService mernisService;
	
	
	
	
	@Autowired
	public JobSeekerManager(JobSeekerDao seekerDao, MernisService mernisService
			) {
		super();
		this.seekerDao = seekerDao;
		this.mernisService = mernisService;
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.seekerDao.findAll(),"Data eklendi");
	}

	@Override
	public Result add(JobSeeker seeker) throws NumberFormatException, RemoteException {
		
		boolean verificationResult = RealPerson(seeker);
		if(!verificationResult) {
			return new ErrorResult("Kullanıcı bilgileri yanlıştır");
		}
		
		this.seekerDao.save(seeker);
		return new SuccessResult("İş arayan eklendi");
	}
	
	public boolean RealPerson(JobSeeker seeker) throws NumberFormatException,RemoteException{
		
		boolean verificationResult = this.mernisService.RealPerson(seeker);
		if(!verificationResult)
		return false;
		return true;
	}

}
