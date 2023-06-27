package com.example.placement.controller;


import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.placement.domain.Student;
import com.example.placement.service.StudentService;

 
@RestController
public class StudentController {
@Autowired
  private StudentService service;
 
    @GetMapping("/addstudent")
    public List<Student> add(Model model) {
     return   service.listAll();
       // model.addAttribute("liststudent", liststudent);
       //  return "addstudent";
    }
    
    @GetMapping("/students")
    public List<Student> getAll() {
     return   service.listAll();
       // model.addAttribute("liststudent", liststudent);
       //  return "addstudent";
    }
 
 
    @PostMapping( "/save")
    public void saveStudent(@RequestBody Student student) {
        service.save(student);
       
    }
 
    @PutMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("addstudent");
        Student student = service.get(id);
        mav.addObject("course", student);
        return mav;
        
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCoursePage(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/student";
    }
}