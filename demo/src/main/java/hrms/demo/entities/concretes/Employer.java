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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false) //Nesne içeriğini kontrol eder.
@Entity
@Table(name = "employer_register")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	

	@Column(name = "company_name")
	@NotBlank(message = "Company alanı Boş Bırakılamaz")
	private String CompanyName;
	
	

	@Column(name = "web_site")
	@NotBlank(message = "Web Site alanı Boş Bırakılamaz")
	private String webSiteAdress;
	
	
	@Column(name = "phone_number")
	@NotBlank(message = "PhoneNumber alanı Boş Bırakılamaz")
	private int phoneNumber;
	
	

	

}
