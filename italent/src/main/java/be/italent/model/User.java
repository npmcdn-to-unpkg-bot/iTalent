package be.italent.model;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 2013292116325497059L;

	@Id
	@GeneratedValue
	private int id;
	
	@Size(min=2, max=55)
	private String firstname;
	
	@Size(min=2, max=55)
	private String lastname;
	
	@JsonBackReference
	@OneToOne
	private Role role;
	
	@OneToOne
	private Department department;
	
	@NotNull
	@Size(min=2, max=55)
	@Column(unique = true)
	private String username;
	
	@NotNull
	@Size(min=8, max=80)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}