package be.italent.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

@Data
@Entity
public class Announcement extends AbstractITalentEntity implements Serializable {
	private static final long serialVersionUID = -2877165021984304481L;
	@Id
	@GeneratedValue
	private long id;
	
	@Lob
	private String text;
	
	@JsonManagedReference
	@ManyToOne
	private Project project;
}
