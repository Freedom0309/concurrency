package com.mmall.concurrency;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test1111111";
    }
}
