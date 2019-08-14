package com.manager.global.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ControllerAdvice 后无值，默认为 还项目中的所有controller！
 * @ControllerAdvice  是 @Controller的增强
 */
@ControllerAdvice
public class FinanceGlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(FinanceGlobalExceptionHandler.class);

    //声明要捕获的异常
    @ExceptionHandler(FinanceException.class)
    @ResponseBody
    public Map<String, Object> defultExcepitonHandler(HttpServletRequest request, Exception e) {
        Map<String, Object> map = new HashMap<String, Object>();
        logger.info("程序出现异常，请查看日志！");
        if (e instanceof FinanceException) {
            map.put("code", ((FinanceException) e).getCode());
            map.put("method",request.getRequestURI());
            map.put("msg", e.getMessage());
            return map;
        } else {  //其他未知错误
            map.put("code", ErrorEnums.UNKONW_ERROR);
            map.put("method","/");
            map.put("msg", "发生未知错误，请联系管理员！");
            return map;
        }

    }

}
