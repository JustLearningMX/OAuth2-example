package tech.hiramchavez.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.hiramchavez.oauth.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
