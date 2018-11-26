package com.ant.controller;

import com.ant.pojo.TargetApp;
import com.ant.service.ITargetAppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: Administrator
 * @Date: 2018/11/26 0026 15:09
 * @Description:
 */
@Controller
public class TargetAppController extends BaseController{
    Logger logger = LoggerFactory.getLogger(TargetAppController.class);
    @Autowired
    private ITargetAppService targetAppService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index (HttpServletRequest request, HttpServletResponse response){

        return new ModelAndView("index", "", "");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index1 (HttpServletRequest request, HttpServletResponse response){

        TargetApp targetApp = new TargetApp();
        //targetAppService.getTargetAppList(targetApp);

        return new ModelAndView("index", "", "");
    }

    @RequestMapping(value = "/targetApp", method = RequestMethod.GET)
    public ModelAndView appInfo (HttpServletRequest request, HttpServletResponse response,String id){
        logger.debug(id);
       // targetAppService.getTargetAppById(id);
        return new ModelAndView("targetApp", "", "");
    }

    @RequestMapping(value = "/addApp", method = RequestMethod.GET)
    public ModelAndView addApp (HttpServletRequest request, HttpServletResponse response){

        return new ModelAndView("addApp", "", "");
    }

    @RequestMapping(value = "/addApp", method = RequestMethod.POST)
    public ModelAndView addApp (HttpServletRequest request, HttpServletResponse response,TargetApp targetApp){
        logger.debug(targetApp.getAppName());
        targetAppService.addTargetApp(targetApp);
        return new ModelAndView("targetApp", "", "");
    }

}
