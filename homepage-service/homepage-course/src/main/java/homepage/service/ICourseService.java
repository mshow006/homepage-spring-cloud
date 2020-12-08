package homepage.service;

import homepage.CourseInfo;
import homepage.CourseInfoRequest;

import java.util.List;

public interface ICourseService {

    CourseInfo getCourseInfo(Long id);

    List<CourseInfo> getCourseInfos(CourseInfoRequest request);
}
