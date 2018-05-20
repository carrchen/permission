package com.itclub4u.controller;

import com.itclub4u.common.ApplicationContextHelper;
import com.itclub4u.common.JsonData;
import com.itclub4u.dao.SysAclModuleMapper;
import com.itclub4u.exception.ParamException;
import com.itclub4u.exception.PermissionException;
import com.itclub4u.model.SysAclModule;
import com.itclub4u.param.TestVo;
import com.itclub4u.util.BeanValidator;
import com.itclub4u.util.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Validator;
import java.util.Map;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/hello.json")
    @ResponseBody
    public JsonData hello() {
        log.info("hello");
        throw new RuntimeException("test exception");
       // return JsonData.success("hello,permission");
    }

    @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestVo vo) throws ParamException {
        log.info("validate");
        BeanValidator.check(vo);
        return JsonData.success("test validate");
    }
}
