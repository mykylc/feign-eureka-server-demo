package com.ky.feign.eureka.server;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkai
 * @company 京东成都研究院-供应链
 * @dateTime 2018/9/7 上午12:19
 * @className com.ky.feign.eureka.server.IndexController
 * @description
 **/
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "success";
    }
}
