package homepage.service;

import com.alibaba.fastjson.JSON;
import homepage.Application;
import homepage.CourseInfoRequest;
import homepage.dao.HomepageCourseDao;
import homepage.entity.HomepageCourse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HomepageCourseServiceTest {

    @Autowired
    private HomepageCourseDao courseDao;

    @Autowired
    private ICourseService iCourseService;

    //    @Test
    public void testCreateCourseInfo() {
        HomepageCourse course1 = new HomepageCourse(
                "course1",
                0,
                "https://www.baicu.com",
                "intro1");
        HomepageCourse course2 = new HomepageCourse(
                "course2",
                1,
                "https://www.google.com",
                "intro2");
        System.out.println(courseDao.saveAll(Arrays.asList(course1, course2)).size());
    }

    @Test
    public void testGetCourseInfo() {
        System.out.println(JSON.toJSONString(iCourseService.getCourseInfo(8L)));
        System.out.println(JSON.toJSONString(iCourseService.getCourseInfo(1L)));
    }

    @Test
    public void testGetCourseInfos() {
//        System.out.println(JSON.toJSONString(iCourseService.getCourseInfos(new CourseInfoRequest(Arrays.asList(8L, 9L)))));
        log.info("{}", JSON.toJSONString(iCourseService.getCourseInfos(new CourseInfoRequest(Arrays.asList(8L, 9L)))));
    }
}
