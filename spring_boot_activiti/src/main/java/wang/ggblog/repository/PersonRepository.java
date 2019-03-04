package wang.ggblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wang.ggblog.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByUsername(String username);

}