package edu.icet.service;

import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

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
}
