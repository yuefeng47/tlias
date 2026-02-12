package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
    // 构造方法私有
    private LoggerUtil(){}

    // 获取日志对象
//    private static final Logger LOGGER = LoggerFactory.getLogger("此位置可以写一个字符串或者一个类的字节码对象");
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUtil.class);

    // 对外提供日志对象
    public static Logger getInstance(){
        return LOGGER;
    }
}
