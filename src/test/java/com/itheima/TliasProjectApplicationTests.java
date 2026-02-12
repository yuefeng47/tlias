package com.itheima;

import com.itheima.log.LoggerUtil;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TliasProjectApplicationTests {
    @Test
    void contextLoads() {
        // 获取日志对象
        Logger logger = LoggerUtil.getInstance();

        // 通过日志调用方法打印数据

        logger.error("trace级别的日志");
        logger.debug("debug级别的日志");
        logger.info("info级别的日志");
        logger.warn("warn级别的日志");
        logger.trace("error级别的日志");
    }
}
