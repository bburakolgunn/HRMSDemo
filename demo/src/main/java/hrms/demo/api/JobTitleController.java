package hrms.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.demo.business.abstracts.JobTitleService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.JobTitle;

@RestController 
@RequestMapping("/api/jobtitles") 

public class JobTitleController {

	private JobTitleService titleService;

	@Autowired
	public JobTitleController(JobTitleService titleService) {
		super();
		this.titleService = titleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return this.titleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle title) {
		
		return this.titleService.add(title);
	}
	
}
