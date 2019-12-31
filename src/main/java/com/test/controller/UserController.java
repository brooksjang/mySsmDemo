package com.test.controller;

import com.test.entity.User;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //起始页
    @RequestMapping("/index")
    public String index(){
        return "user/helloWorld";
    }

    //全查询页面
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<User> users = userService.selectAll();
        model.addAttribute("users", users);
        return "user/findAll";
    }

    //按照条件查询
    @RequestMapping(value = "findByInfo")
    public String find(User user, Model model){
        List<User> users = userService.selectBySelective(user);
        model.addAttribute("users", users);
        return "user/find";
    }

    //按照条件查询
    @RequestMapping(value = "findById", method = RequestMethod.GET)
    public String findById(long id, Model model){
        List<User> users = userService.selectById(id);
        model.addAttribute("users", users);
        return "user/findById";
    }

}
