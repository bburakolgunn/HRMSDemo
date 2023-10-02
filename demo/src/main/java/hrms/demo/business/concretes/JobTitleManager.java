package hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.demo.business.abstracts.JobTitleService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.dataAccess.abstracts.JobTitleDao;
import hrms.demo.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao titleDao;

	@Autowired
	public JobTitleManager(JobTitleDao titleDao) {
		super();
		this.titleDao = titleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		
		return new SuccessDataResult<List<JobTitle>>(this.titleDao.findAll(),"Data eklendi");
	}

	@Override
	public Result add(JobTitle title) {
		this.titleDao.save(title);
		return new SuccessResult("İş pozisyonu eklendi");
	}
	

}
