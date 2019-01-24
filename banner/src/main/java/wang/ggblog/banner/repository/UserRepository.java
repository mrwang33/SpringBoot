package wang.ggblog.banner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wang.ggblog.banner.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
