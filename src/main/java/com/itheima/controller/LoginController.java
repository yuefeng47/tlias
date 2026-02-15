package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.LoginService;
import com.itheima.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp) {
        // 调用 Service 进行登录验证
        Emp loginEmp = loginService.login(emp);

        // 判断是否登录成功
        if (loginEmp != null) {
            // 登录成功，生成 JWT 令牌
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", loginEmp.getId());
            claims.put("username", loginEmp.getUsername());
            claims.put("name", loginEmp.getName());

            String token = JwtUtils.generateJwt(claims);

            // 构建返回数据
            Map<String, Object> data = new HashMap<>();
            data.put("id", loginEmp.getId());
            data.put("username", loginEmp.getUsername());
            data.put("name", loginEmp.getName());
            data.put("token", token);

            return Result.success(data);
        }

        // 登录失败
        return Result.error("用户名或密码错误");
    }
}

