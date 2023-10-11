package hrms.demo.core.utilities.validator;

import hrms.demo.core.utilities.results.ErrorResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessResult;

public class WebAdressEmailControl {
	
	public static Result control(String email,String webSiteAdress) {
		   //contains belirtilen dizede bir karakter dizisi olup olmadığını gösterir
		 String[] emailDivide = email.split("@", 2);
	        String[] webDivide = webSiteAdress.split("www.", 2);
	        
	        if (!(webDivide[1].contains(emailDivide[1]))) {
	            return new ErrorResult("Email ve domain aynı değil,lütfen tekrar deneyiniz.");
	        } else {
	            return new SuccessResult();
	        }
	}

}
