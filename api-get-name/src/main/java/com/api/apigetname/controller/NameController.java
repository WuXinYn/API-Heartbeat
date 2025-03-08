package com.api.apigetname.controller;

import com.api.apigetname.modle.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/name")
public class NameController
{
    @GetMapping("/get")
    public String getNameByGet(String name){
        return "Get你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "Post你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request){
        // todo request染色判断（待做）
        return "Post用户名是" + user.getUsername();
    }
}
