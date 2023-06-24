package Com.Arc.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	private String phone;
	
	@OneToMany(mappedBy = "patient")
	private List<Appointment>appointments;
	
	@ManyToMany
	@JoinTable(name = "doc_pat",
	joinColumns = @JoinColumn(name="Doc_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="pat_id", referencedColumnName = "id"))
	private List<Doctor> doctors;
	
}
