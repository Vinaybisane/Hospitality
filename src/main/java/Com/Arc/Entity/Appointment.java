package Com.Arc.Entity;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Timestamp appointmenttime;
	private Boolean started;
	private Boolean end;
	private String reason;
	
	@ManyToOne
	@JoinColumn(name = "doc_id")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "pat_id")
	private Patient patient;
}
