package Com.Arc.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fname;
	private String lname;
	private String specialization;
	
	@OneToMany(mappedBy = "doctor")
	private List<Appointment> appointments;
	
	@ManyToMany(mappedBy = "doctors")
	private List<Patient>patients;
}
