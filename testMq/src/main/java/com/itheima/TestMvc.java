package com.itheima;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @Author: zh
 * @Date: 2019/5/21 15:46
 */
@Controller
@RequestMapping("/user")
@SessionAttributes(value = {"username","password","age"},types = {String.class,String.class})
public class TestMvc {
    @RequestMapping("/save")
    public String test01(Model model) {

        return "su";

    }

}
