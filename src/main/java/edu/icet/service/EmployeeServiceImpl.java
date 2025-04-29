package edu.icet.service;
import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addCustomer(Employee employee) {
        repository.save(mapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {

        List<Employee> employeeList = new ArrayList<>();
        List<EmployeeEntity> all = repository.findAll();


        all.forEach(employeeEntity -> {

            employeeList.add(mapper.map(employeeEntity, Employee.class));
        });
        return employeeList;
    }

    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateEmployee(Integer id,Employee employee) {
        EmployeeEntity existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existing.setName(employee.getName());
        existing.setGender(employee.getGender());


        repository.save(existing);
    }

    @Override
    public Employee SearchById(Integer id) {
        return mapper.map(repository.findById(id), Employee.class);

    }

    @Override
    public List<Employee> searchByName(String name) {
        List<EmployeeEntity> byName = repository.findByName(name);
        List<Employee> customerList = new ArrayList<>();

        List<Employee> employeeList = List.of();
        byName.forEach(employeeEntity -> {
            employeeList.add(mapper.map(employeeEntity, Employee.class));

        });
        return employeeList;

    }
}
