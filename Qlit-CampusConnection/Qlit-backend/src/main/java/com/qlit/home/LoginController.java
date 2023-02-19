package com.qlit.home;

import com.qlit.user.entity.Users;
import com.qlit.user.service.impl.UsersServiceImpl;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    UsersServiceImpl usersService;
    @GetMapping("/login")
    public String getLogin(){

        return "login";
    }
    @PostMapping("/login")
    public String getLoginPost(@RequestParam String username ,@RequestParam String password){

        val users = usersService.selUser(username, password);



        System.out.println("登陆成功");
        return "home";
    }

}
