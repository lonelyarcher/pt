package doitt.nyc.gov.pt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import doitt.nyc.gov.pt.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
