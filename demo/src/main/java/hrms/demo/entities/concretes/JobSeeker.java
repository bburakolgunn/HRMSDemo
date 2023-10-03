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
@Table(name = "register_jobSeeker")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seeker_id")
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
	
	
	@Column(name = "password")
	@NotBlank(message = "Password Alanı Boş Bırakılamaz")
	private String Password;
	
	
	@Column(name = "email")
	@NotBlank(message = "Email Alanı Boş Bırakılamaz")
	private String email;
	
	
}
