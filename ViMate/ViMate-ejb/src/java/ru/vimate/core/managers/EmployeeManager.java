package ru.vimate.core.managers;

import java.util.Collections;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ru.vimate.core.entity.jpa.Employee;

/**
 *
 * @author rogvold
 */
@Stateless
public class EmployeeManager implements EmployeeManagerLocal {

    @PersistenceContext(unitName = "ViMate-ejbPU")
    EntityManager em;   

    @Override
    public Employee getEmployeeById(Long employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
