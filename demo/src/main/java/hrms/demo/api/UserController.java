package hrms.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.demo.business.abstracts.UserService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private  UserService userService;
    
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        return this.userService.add(user);
    }

    
    @GetMapping("/getall")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }
}
