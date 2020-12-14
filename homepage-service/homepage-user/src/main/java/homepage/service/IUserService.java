package homepage.service;

import homepage.UserInfo;
import homepage.vo.CreateUserRequest;
import homepage.vo.UserCourseInfo;

public interface IUserService {

    UserInfo createUser(CreateUserRequest request);

    UserInfo getUserInfo(Long id);

    UserCourseInfo getUserCourseInfo(Long id);
}
