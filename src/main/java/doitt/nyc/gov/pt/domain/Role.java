package doitt.nyc.gov.pt.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
@Entity
public class Role implements GrantedAuthority{
	
	private static final long serialVersionUID = -3478764502214525712L;
	
	@Id
	private Long id;
	private String name;

	
	@Override
	public String getAuthority() {		
		return name;
	}

}
