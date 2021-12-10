package com.andootown.log4jbug.controller;

import com.andootown.log4jbug.Log4jBugApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author andootown
 * @Date 2021/12/10 20:32
 * @Version:1.0
 * @Description〈〉
 */
@Controller
public class QuickStartController {
    public static final Logger LOG = LogManager.getLogger(QuickStartController.class);
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        LOG.info("${jndi:ldap://127.0.0.1:3001/}");
        return "hello SpringBoot !";
    }


}
