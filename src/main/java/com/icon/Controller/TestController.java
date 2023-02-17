package com.icon.Controller;
import com.icon.Employee.EmployeeEntity;
import com.icon.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    EmployeeService empService;

    //add
    @RequestMapping(value="/employees", method= RequestMethod.POST)
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity emp)
    {
        return empService.createEmployee(emp);
    }

    //listAll
    @RequestMapping(value="/employees", method=RequestMethod.GET)
    public List<EmployeeEntity> readEmployees()
    {
        return empService.getEmployees();
    }


    //listById

    @RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
    public EmployeeEntity readEmployees(@PathVariable(value = "empId") Long id,
                                        @RequestBody EmployeeEntity empDetails)
    {
        return empService.updateEmployee(id, empDetails);
    }


    //delete
    @RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
    public void deleteEmployees(@PathVariable(value = "empId") Long id)
    {
        empService.deleteEmployee(id);
    }

}
