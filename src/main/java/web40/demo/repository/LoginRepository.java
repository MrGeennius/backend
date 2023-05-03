package web40.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web40.demo.model.User;

@Repository
public interface LoginRepository extends CrudRepository<User, Integer> {
     User findByMailUser(String mailUser);
}