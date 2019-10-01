package com.ds.storehouse.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//添加controler注解将该类作为controller识别，作用范围在Application文件的同级或下级目录
@Controller
public class IndexController {
    //getmappering注解，配对resource文件夹下templates包中的html文件名
@GetMapping("/index")
    public String index(@RequestParam(name = "name")String name, Model model){
    //将浏览器传的变量赋值到model
        model.addAttribute("name",name);
return  "index";
}
}
