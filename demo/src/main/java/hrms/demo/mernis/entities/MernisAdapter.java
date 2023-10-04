package hrms.demo.mernis.entities;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import hrms.demo.entities.concretes.JobSeeker;
import hrms.demo.mernis.abstracts.MernisService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisAdapter implements MernisService {

	@Override
	public boolean RealPerson(JobSeeker seeker) throws NumberFormatException, RemoteException {
	
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(Long.parseLong(seeker.getNationalityId()),seeker.getFirstName().toUpperCase(),
				seeker.getLastName().toUpperCase(), seeker.getBirthYear());
	}

}
