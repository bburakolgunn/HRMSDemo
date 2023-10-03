package hrms.demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "employer_register")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employer_id")
	private int id;
	
	

	@Column(name = "company_name")
	@NotBlank(message = "Company alanı Boş Bırakılamaz")
	private String CompanyName;
	
	

	@Column(name = "web_site")
	@NotBlank(message = "Web Site alanı Boş Bırakılamaz")
	private String webSite;
	
	

	@Column(name = "website_email")
	@NotBlank(message = "Website-Email alanı Boş Bırakılamaz")
	private String website_email;
	
	
	@Column(name = "password")
	@NotBlank(message = "Password Alanı Boş Bırakılamaz")
	private String password;
	
	@Column(name = "phone_number")
	@NotBlank(message = "PhoneNumber alanı Boş Bırakılamaz")
	private int phoneNumber;
	
	

	

}
