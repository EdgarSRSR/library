package com.example.library;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository repo;

    public List<Employees> listAll(){
        return repo.findAll();
    }

    public void save(Employees employee){
        repo.save(employee);
    }

    public Employees get(Long employeeId){
        return repo.findById(employeeId).get();
    }

    @RequestMapping("/getUser")
    public ModelAndView getUser(@RequestParam Long employeeId){
        ModelAndView mv = new ModelAndView("client.html");
        Optional<Employees> user = repo.findById(employeeId);
        mv.addObject(user);
        System.out.println(repo.findByAdmin(true));
        //System.out.println(repo.findByDepartmentSorted('hr'));
        return mv;
    }

    public void delete(Long employeeId){
        repo.deleteById(employeeId);
    }

}
