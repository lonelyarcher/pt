package doitt.nyc.gov.pt.domain;

import java.io.Serializable;
import java.security.Principal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class User implements Principal, Serializable{
	
	private static final long serialVersionUID = 1847366637043249839L;
	
	@Id
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	@JsonIgnore
	private String password;
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private Set<Role> roles;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_franchise", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "franchise_id", referencedColumnName = "id"))
	private Set<Franchise> franchises;
	
	@Override
	public String getName() {
		return username;
	}

}
