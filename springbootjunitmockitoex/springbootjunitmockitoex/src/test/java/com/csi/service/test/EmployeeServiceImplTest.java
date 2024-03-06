package com.csi.service.test;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import com.csi.service.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @MockBean
    private EmployeeRepo employeeRepoImpl;

    @Test
    public void signUpTest() {
        Employee employee = new Employee(111, "GUNJALI", "PUNE", 9632145786L, 75000.45, new Date(), "GUNJALI@CS.COM", "GUNJALI");
        employeeServiceImpl.signUp(employee);

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).save(employee);
    }

    @Test
    public void findByIdTest() {
        Employee employee = new Employee(111, "GUNJALI", "PUNE", 9632145786L, 75000.45, new Date(), "GUNJALI@CS.COM", "GUNJALI");
        employeeServiceImpl.findById(employee.getEmpId());

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).findById(employee.getEmpId());

    }


    @Test
    public void findAllTest() {

        Mockito.when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(111, "GUNJALI", "PUNE", 9632145786L, 75000.45, new Date(), "GUNJALI@CS.COM", "GUNJALI"), new Employee(121, "VIKAS", "PUNE", 8765987412L, 96000.45, new Date(), "VIKAS@CS.COM", "VIKAS"), new Employee(112, "YASH", "PUNE", 9420525586L, 87000.45, new Date(), "YASH@CS.COM", "YASH")).toList());

        Assert.assertEquals(3, employeeServiceImpl.findAll().size());
    }

    @Test
    public void updateTest() {
        Employee employee = new Employee(111, "GUNJALI", "PUNE", 9632145786L, 75000.45, new Date(), "GUNJALI@CS.COM", "GUNJALI");
        employeeServiceImpl.update(employee);

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).save(employee);
    }


    @Test
    public void deleteByIdTest() {
        Employee employee = new Employee(111, "GUNJALI", "PUNE", 9632145786L, 75000.45, new Date(), "GUNJALI@CS.COM", "GUNJALI");
        employeeServiceImpl.deleteById(employee.getEmpId());

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).deleteById(employee.getEmpId());

    }

    @Test
    public void findByName() {

        Employee employee = new Employee();
        Mockito.when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(111, "GUNJALI", "PUNE", 9632145786L, 75000.45, new Date(), "GUNJALI@CS.COM", "GUNJALI"), new Employee(121, "VIKAS", "PUNE", 8765987412L, 96000.45, new Date(), "VIKAS@CS.COM", "VIKAS"), new Employee(112, "YASH", "PUNE", 9420525586L, 87000.45, new Date(), "YASH@CS.COM", "YASH")).toList());

        employeeServiceImpl.findByName(employee.getEmpName());

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).findByEmpName(employee.getEmpName());

    }

    @Test
    public void deleteAll() {

        employeeServiceImpl.deleteAll();

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).deleteAll();

    }


}
