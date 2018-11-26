package com.ant.controller;

import com.ant.form.ResultSetForm;
import com.ant.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ant.global.EnumReturnCode.ReturnCode;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class UserController extends BaseController{
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/login_ajax")
    public ResponseEntity<ResultSetForm> login(@RequestBody Map<String,Object> map) {
        try {
            // Get param
            String account = String.valueOf(map.get("account"));
            String password = String.valueOf(map.get("password"));

            boolean isSuccess = userServiceImpl.login(account,password);
            if (isSuccess) {
                rsf.setResult(true, ReturnCode.Success, "ok.");
            } else {
                rsf.setResult(false, ReturnCode.Error_Validate, " 用户名或密码错误！");
            }
        } catch (Exception e) {
            rsf.setResult(false, ReturnCode.Error, "运行时错误！");
        }
        return new ResponseEntity<ResultSetForm>(rsf, HttpStatus.OK);
    }

    @RequestMapping(value = "/login")
    public ModelAndView login (){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }




}
