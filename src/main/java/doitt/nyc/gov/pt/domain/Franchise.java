package doitt.nyc.gov.pt.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Franchise {
	
	@Id
	private Long id;
	private String name;

}
