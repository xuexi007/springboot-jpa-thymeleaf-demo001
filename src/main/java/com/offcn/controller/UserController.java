package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 发生修改001
 */
//-----------------线上修改002---------------------------
@Controller //加普通控制器注解，返回模板视图
public class UserController {
    @Autowired
    private UserService userService;

    //查询全部用户数据，跳转到显示全部用户数据的模板
    @RequestMapping("/")
    public String findAll(Model model){

        List<User> all = userService.findAll();

        //封装全部用户数据到数据模型
        model.addAttribute("page",all);

        //小张修改代码：001
        for (int i = 0; i <10 ; i++) {
            System.out.printf("小张循环代码");
        }

        //跳转到显示全部用户数据的模板
        return "user/list";
    }

    //跳转到新增页面
    @RequestMapping("toAdd")
    public String toAdd(){

        //跳转到新增模板页面
        return "user/userAdd";
    }

    //保存新增用户数据方法
    @PostMapping("add")
    public String add(User user){
        userService.add(user);
        //保存成功，跳转到获取全部用户列表页
        return "redirect:/";
    }

    //根据指定用户编号，跳转到编辑页面
    @RequestMapping("toEdit/{id}")
    public String toEdit(@PathVariable("id") Long id, Model model){
        //根据用户id，读取用户信息
        User user = userService.findOne(id);
        //封装到数据模型
        model.addAttribute("user",user);

        //跳转到编辑页面
        return "user/userEdit";
    }

    //保存更新数据
    @RequestMapping("update")
    public String update(User user){
        userService.update(user);
        return "redirect:/";
    }

    //删除数据
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id){
        userService.delete(id);

        return "redirect:/";
    }
}
