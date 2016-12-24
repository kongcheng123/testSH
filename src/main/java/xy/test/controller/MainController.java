package xy.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xy.test.entity.User;
import xy.test.service.UserService;
import xy.test.service.UserServiceImpl;

import java.util.List;

/**
 * Created by xy on 2016/12/24.
 */
@Controller
public class MainController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/")    //实际访问的url地址
    public String returnSuccess()
    {
        System.out.println("============");
        return "/Views/success";    //返回Views文件夹下的success.jsp页面
    }

    @RequestMapping(value = "/dianji")    //实际访问的url地址
    public String dianji()
    {
        System.out.println("--------");
        User u=new User();
        u.setUsername("hhhhhhhh");
        userService.saveUser(u);
        System.out.println("+++++++++");
        return "/Views/success1";    //返回Views文件夹下的success.jsp页面
    }

}
