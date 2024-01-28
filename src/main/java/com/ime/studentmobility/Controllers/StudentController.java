package com.ime.studentmobility.Controllers;


import com.ime.studentmobility.Repositories.StudentRepository;
import com.ime.studentmobility.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/students/")
public class StudentController {
private final StudentRepository studentRepository;
@Autowired
public StudentController(StudentRepository studentRepository)
{
this.studentRepository = studentRepository;
}
@GetMapping("signup")
public String showSignUpForm(Student student) {
return "add-student";
}
@GetMapping("list")
public String showUpdateForm(Model model) {
model.addAttribute("students",
studentRepository.findAll());
return "index";
}
@PostMapping("add")
public String addStudent( Student student, BindingResult
result, Model model) {
if (result.hasErrors()) {
return "add-student";
}
studentRepository.save(student);
return "redirect:list";
}
@GetMapping("edit/{id}")
public String showUpdateForm(@PathVariable("id") Integer id, Model
model) {
Student student = studentRepository.findById(id)
.orElseThrow(() -> new
IllegalArgumentException("Invalid student Id:" + id));
model.addAttribute("student", student);
return "update-student";
}
@PostMapping("update/{id}")
public String updateStudent(@PathVariable("id") Integer id,
Student student, BindingResult result,
Model model) {
if (result.hasErrors()) {
student.setId(id);
return "update-student";
}
studentRepository.save(student);
model.addAttribute("students",
studentRepository.findAll());
return "index";
}
}