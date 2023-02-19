package com.qlit.home;

import com.qlit.user.entity.Users;
import com.qlit.user.service.impl.UsersServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class RegisterController {
    @Resource
    UsersServiceImpl usersService;
    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }
    @PostMapping("/register")
    public String getRegisterPost(@RequestParam String username,@RequestParam String password){
       //todo 注册用户
        usersService.addUser(username,password);
        return "home";
    }
}
