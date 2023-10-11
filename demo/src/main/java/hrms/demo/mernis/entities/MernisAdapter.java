package hrms.demo.mernis.entities;

	

import org.springframework.stereotype.Service;

import hrms.demo.core.utilities.results.ErrorResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.entities.concretes.JobSeeker;
import hrms.demo.mernis.abstracts.MernisService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisAdapter implements MernisService {

	

	@Override
	public Result CheckPerson(JobSeeker seeker) throws Exception {
		// TODO Auto-generated method stub
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result =  client.TCKimlikNoDogrula(Long.valueOf(seeker.getNationalityId()),seeker.getFirstName().toUpperCase(),
				seeker.getLastName().toUpperCase(), seeker.getBirthYear());
		
		if(!result) {
			return new ErrorResult();
		}else {
			return new SuccessResult();
		}
	
	
	}
	}


