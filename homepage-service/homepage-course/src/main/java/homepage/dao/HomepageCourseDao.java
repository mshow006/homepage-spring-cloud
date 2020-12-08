package homepage.dao;

import homepage.entity.HomepageCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomepageCourseDao extends JpaRepository<HomepageCourse, Long> {
}
