package hrms.demo.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.demo.business.abstracts.JobSeekerService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.ErrorResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.core.utilities.validator.PasswordControl;
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
		//this.verificationService = verificationService;
	}

	
	@Override
	public Result add(JobSeeker seeker) throws Exception {
		
		if(!this.mernisService.CheckPerson(seeker).isSuccess()) {
			return new ErrorResult("Tekrar deneyiniz");
		}
		
		Result result = PasswordControl.control(seeker.getPassword(), seeker.getAgainpassword());
		if(!result.isSuccess()) {
			return new ErrorResult(result.getMessage());
			}
		
		
		
		
	
		
		this.seekerDao.save(seeker);
		return new SuccessResult("İş arayan eklendi");
	}
	

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.seekerDao.findAll(),"Data Listesi");
	}

}
