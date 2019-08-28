package com.eds.service;

import com.eds.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public Iterable<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Employee> getEmployeeByName(String name){
        return employeeRepository.findByFirstName(name);
    }


    @Transactional(readOnly = true)
    public void deleteEmployeeId(Long id){
        employeeRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Employee updateEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    @Transactional(readOnly = true)
    public Employee save(Employee emp){
        return employeeRepository.save(emp);
    }

}
