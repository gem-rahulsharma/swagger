package com.rahul.employees.controller;
import com.rahul.employees.entity.EmployeeEntity;
import com.rahul.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/save")
    public String savedEmployee(@RequestBody EmployeeEntity employeeEntity)
    {
        employeeService.saveEmployee(employeeEntity);
        return "data saved successfully";
    }
    @GetMapping("/showAll")
    public List<EmployeeEntity> showAll()
    {
        return (List<EmployeeEntity>) employeeService.showAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<EmployeeEntity> empById(@PathVariable long id)
    {
        return employeeService.employeeById(id);
    }
    @DeleteMapping("/{id}")
    public String deletedEmployee(@PathVariable long id)
    {
              employeeService.deleteEmployee(id);
                return "data deleted";
    }
    @PutMapping("/{id}")
    public String employeeUpdate(@RequestBody EmployeeEntity employeeEntity,@PathVariable long id)
    {
        employeeService.updateEmployee(employeeEntity ,id);
        return "data updated successfully";
    }
}
