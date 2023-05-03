
package web40.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web40.demo.model.AboutDesc;

@Repository
public interface AboutDescRepository extends JpaRepository<AboutDesc, Long> {
}
