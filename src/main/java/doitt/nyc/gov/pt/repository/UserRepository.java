package doitt.nyc.gov.pt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import doitt.nyc.gov.pt.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
