package edu.icet.dto;

import edu.icet.util.EmployeeGender;
import edu.icet.util.EmployeeGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

        private Integer id;
        private String name;
        private String email;
        private String department;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private EmployeeGender gender;


}
