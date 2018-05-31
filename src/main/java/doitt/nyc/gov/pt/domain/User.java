package doitt.nyc.gov.pt.domain;

import java.io.Serializable;
import java.security.Principal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

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
	private Set<? extends GrantedAuthority> roles;
	private Set<Franchise> franchises;
	
	@Override
	public String getName() {
		return username;
	}

}
