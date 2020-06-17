package com.it.controller;


import com.it.domain.Employee;
import com.it.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployController {

    @Autowired
    private EmployeeService employeeService;



    @RequestMapping("/findAll")
    public String findAll(Model model) {

        List<Employee> all = employeeService.findAll();

        model.addAttribute("employee" , all);
        return "success";
    }

    @RequestMapping("/save")
    public String saveEmploy(@Validated Employee employee, BindingResult bindingResult){

        Map<String, Object> resultMap = new HashMap<String, Object>();

        System.out.println(employee);

        // 如果校验时有不符合校验规则的情况出现，springMVC会将错误信息放在
        // BindingResult对象的错误提示信息里面

        if(!bindingResult.hasErrors()){
            System.out.println("发生错误！");

            List<ObjectError> errors = bindingResult.getAllErrors();
            for (ObjectError error : errors) {
                System.out.println(error.getDefaultMessage());
            }
            resultMap.put("errors", errors);

        }
//        employeeService.saveEmployee(employee);
//
//        System.out.println("保存成功");

        return "redirect:./findAll";
    }

    @RequestMapping("/delete")
    public String deleteEmploy(int id){

        boolean byId = employeeService.findById(id);

        if(byId){

            System.out.println("可以删除");
            employeeService.delEmployee(id);
            System.out.println("删除成功");

            return "redirect:./findAll";
        }else{
            System.out.println("用户已经存在！");
            return "redirect:./findAll";
        }

    }

    @RequestMapping("/update")
    public String updateEmploy(Employee employee){

        boolean Id = employeeService.findById(employee.getId());

        if(Id){

            System.out.println("可以修改");
            employeeService.updateEmploy(employee);
            System.out.println("修改成功");

            return "redirect:./findAll";
        }else{
            System.out.println("用户不存在！");
            return "redirect:./findAll";
        }

    }
}
