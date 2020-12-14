package homepage.service;

import com.alibaba.fastjson.JSON;
import homepage.Application;
import homepage.dao.HomepageUserCourseDao;
import homepage.entity.HomepageUserCourse;
import homepage.vo.CreateUserRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class HomepageUserServiceTest {

    @Autowired
    private IUserService userService;

    @Autowired
    private HomepageUserCourseDao userCourseDao;

    @Test
//    @Transactional
    public void testCreateUser() {
        System.out.println(JSON.toJSONString(
                userService.createUser(new CreateUserRequest(
                        "username", "@gmail"
                ))
         ));
    }

    @Test
    public void testGetUserInfo() {

        System.out.println(JSON.toJSONString(
                userService.getUserInfo(10L)
        ));
    }

    @Test
    public void testCreateHomepageUserCourse() {

        HomepageUserCourse course1 = new HomepageUserCourse();
        course1.setUserId(10L);
        course1.setCourseId(8L);

        HomepageUserCourse course2 = new HomepageUserCourse();
        course2.setUserId(10L);
        course2.setCourseId(9L);

        System.out.println(userCourseDao.saveAll(
                Arrays.asList(course1, course2)
        ).size());
    }
}
