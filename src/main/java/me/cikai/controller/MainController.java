package me.cikai.controller;

import java.util.List;

import me.cikai.dto.LoginDto;
import me.cikai.model.LoginModel;
import me.cikai.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    MainService service = null;

    @RequestMapping("/main")
    @ResponseBody
    public ModelAndView initPage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("login");
        return view;
    }

    @RequestMapping("/login")
    @ResponseBody
    public int login(LoginModel loginModel) {
        int loginCheck;
        String name = loginModel.getName();
        List<LoginDto> loginCheckList = service.login(name);
        String modelPassword = loginModel.getPassword();
        String dtoPassword = String.valueOf(loginCheckList.get(0).getPassword());
        if (modelPassword.equals(dtoPassword)) {
            loginCheck = 1;
        } else {
            loginCheck = 0;
        }
        return loginCheck;
    }

}
