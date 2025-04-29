package edu.icet.Controller;
import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import edu.icet.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@CrossOrigin

public class EmployeeController {

//    http://localhost:8080/customer/add
//    http://localhost:8080/customer/get-all

    private final EmployeeService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)

    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> getAll() {
        return service.getAll();
    }


    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        service.deleteEmployee(id);

    }

    @PutMapping("/update-employee/{id}")
    public void updateEmployee(@PathVariable Integer id,@RequestBody Employee employee) {
        service.updateEmployee(id,employee);
    }

    @GetMapping("/search-by-id/{id}")
    public Employee searchById(@PathVariable Integer id) {
        return service.SearchById(id);

    }

    @GetMapping("/search-by-name/{name}")
    public List<Employee> searchByName(@PathVariable String name) {
        return   service.searchByName(name);

    }


}






