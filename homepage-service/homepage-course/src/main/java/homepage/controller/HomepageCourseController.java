package homepage.controller;

import com.alibaba.fastjson.JSON;
import homepage.CourseInfo;
import homepage.CourseInfoRequest;
import homepage.service.ICourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class HomepageCourseController {

    private final ICourseService iCourseService;

    public HomepageCourseController(ICourseService iCourseService) {
        this.iCourseService = iCourseService;
    }

    @GetMapping("/get/course")
    public CourseInfo getCourseInfo(Long id) {
        log.info("<homepage-course>: get course -> {}", id);
        return iCourseService.getCourseInfo(id);
    }

    @PostMapping("/get/courses")
    public List<CourseInfo> getCourseInfos(@RequestBody CourseInfoRequest request) {
        log.info("<homepage-course>: get courses -> {}", JSON.toJSONString(request));
        return iCourseService.getCourseInfos(request);
    }
}
