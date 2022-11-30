package org.example.app;

import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/test")
    public String test() {
        Map<String, TestController> beansOfType = applicationContext.getBeansOfType(TestController.class);
        System.out.println(beansOfType);
        return "Ok!";
    }
    @GetMapping("/count")
    public Integer countEmployees() {
        return employeeService.countEmployees();
    }
}
