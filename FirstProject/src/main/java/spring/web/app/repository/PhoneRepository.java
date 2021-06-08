package spring.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.web.app.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
