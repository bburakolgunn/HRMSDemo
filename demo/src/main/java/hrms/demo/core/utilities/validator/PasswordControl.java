package hrms.demo.core.utilities.validator;


import hrms.demo.core.utilities.results.ErrorResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessResult;

public class PasswordControl {
	
	public static Result control(String password,String Againpassword) {
		
		if(password.equals(Againpassword)) {
			return new SuccessResult();
		}else {
			return new ErrorResult("Password eşlemesi olmadı,lütfen tekrar deneyiniz");
		}
	}

}
