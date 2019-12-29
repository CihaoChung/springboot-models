package xyz.wadewhy.user.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wadewhy.common.Common;
import xyz.wadewhy.user.UserService;

/**
 * @PACKAGE_NAME: xyz.wadewhy.user.UserController
 * @NAME: UserController
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("list")
    public Common list() {
        try {
            return Common.isOk().data(userService.UserList());
        } catch (Exception e) {
            return Common.isFail(e);
        }

    }
}
