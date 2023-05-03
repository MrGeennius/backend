
package web40.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web40.demo.model.BannerDesc;

@Repository
public interface BannerDescRepository extends JpaRepository<BannerDesc, Long> {
}
