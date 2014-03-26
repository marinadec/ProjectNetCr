package ru.vimate.core.managers;

import ru.vimate.core.entity.jpa.Employee;
import javax.ejb.Local;

@Local
public interface EmployeeManagerLocal {
    
    public Employee getEmployeeById(Long employeeId);
}
