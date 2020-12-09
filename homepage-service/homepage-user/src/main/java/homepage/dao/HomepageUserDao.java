package homepage.dao;

import homepage.entity.HomepageUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomepageUserDao extends JpaRepository<HomepageUser, Long> {

    HomepageUser findByUsername(String username);
}
