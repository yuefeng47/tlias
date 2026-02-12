package com.itheima;

import org.junit.jupiter.api.Test;

// 测试类
public class UserServiceTest {
    @Test
    public void testGatName() {
        UserService userService = new UserService();
        Integer age = userService.getAge("220203199912093919");
        System.out.println(age);
    }
}
