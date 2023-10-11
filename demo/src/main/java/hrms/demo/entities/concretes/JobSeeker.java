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
@Entity
@EqualsAndHashCode(callSuper = true) //Nesne içeriğini kontrol eder.
@Table(name = "register_jobSeeker")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "firstname")
	@NotBlank(message = "FirstName Alanı Boş Bırakılamaz")
	private String FirstName;
	
	
	@Column(name = "lastname")
	@NotBlank(message = "LastName Alanı Boş Bırakılamaz")
	private String LastName;
	
	
	@Column(name = "NationalityId")
	@NotBlank(message = "NationalityId Alanı Boş Bırakılamaz")
	private String NationalityId;
	
	
	@Column(name = "birthyear")
	@NotBlank(message = "BirthYear Alanı Boş Bırakılamaz")
	private int BirthYear;
	
	

	
	
}
