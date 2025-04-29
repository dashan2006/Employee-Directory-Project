package edu.icet.Controller;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    final EmployeeService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }


}