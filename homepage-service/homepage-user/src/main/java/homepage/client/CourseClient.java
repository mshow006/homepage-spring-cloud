package homepage.client;

import homepage.CourseInfo;
import homepage.CourseInfoRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "eureka-client-homepage-course", fallback = CourseClientHystrix.class)
public interface CourseClient {

    @RequestMapping(value = "/homepage-course/get/course", method = RequestMethod.GET)
    CourseInfo getCourseInfo(Long id);

    @RequestMapping(value = "/homepage-course/get/courses", method = RequestMethod.POST)
    List<CourseInfo> getCourseInfos(@RequestBody CourseInfoRequest request);
}
