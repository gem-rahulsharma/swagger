package com.rahul.employees.service;

import com.rahul.employees.entity.EmployeeEntity;
import com.rahul.employees.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public String saveEmployee(EmployeeEntity employeeEntity){
        employeeRepo.save(employeeEntity);
        return "Data saved successfully";
    }
    public List<EmployeeEntity> showAllEmployee()
    {
        return (List<EmployeeEntity>) employeeRepo.findAll();

    }
    public Optional<EmployeeEntity> employeeById(long id)
    {
       Optional<EmployeeEntity>  employee=employeeRepo.findById(id);
          return Optional.of(employee.get());
    }
    public String deleteEmployee(long id)
    {
        employeeRepo.deleteById(id);
        return "employee deleted";
    }
    public void updateEmployee(EmployeeEntity employeeEntity, long id )
    {
        EmployeeEntity employeeEntity1=employeeRepo.findById( id).get();
        employeeEntity1.setFirstName(employeeEntity.getFirstName());
        employeeEntity1.setLastName(employeeEntity.getLastName());
        employeeEntity1.setEmail_Id(employeeEntity.getEmail_Id());
        employeeRepo.save(employeeEntity1);
    }

}
