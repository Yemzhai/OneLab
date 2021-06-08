package spring.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.web.app.entity.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByAgeGreaterThan(int age);

}
