package hrms.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.demo.business.abstracts.JobSeekerService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.JobSeeker;

@RestController 
@RequestMapping("/api/jobseeker") 
public class JobSeekerController {

	private JobSeekerService seekerService;

	@Autowired
	public JobSeekerController(JobSeekerService seekerService) {
		super();
		this.seekerService = seekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.seekerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker seeker) {
		
		return this.seekerService.add(seeker);
	}
	
}
