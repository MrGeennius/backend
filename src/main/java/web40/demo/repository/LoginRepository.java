package web40.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web40.demo.model.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer> {
     User findByMailUser(String mailUser);
}