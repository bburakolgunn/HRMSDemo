package hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.demo.business.abstracts.JobSeekerService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.dataAccess.abstracts.JobSeekerDao;
import hrms.demo.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService  {

	
	private JobSeekerDao seekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao seekerDao) {
		super();
		this.seekerDao = seekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.seekerDao.findAll(),"Data eklendi");
	}

	@Override
	public Result add(JobSeeker seeker) {
		this.seekerDao.save(seeker);
		return new SuccessResult("İş pozisyonu eklendi");
	}

}
