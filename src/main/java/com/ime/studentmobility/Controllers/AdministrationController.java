package com.ime.studentmobility.Controllers;


import com.ime.studentmobility.Repositories.AdministrationRepository;
import com.ime.studentmobility.entity.Administration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/administration/")
public class AdministrationController {
private final AdministrationRepository administrationRepository;
@Autowired
public AdministrationController(AdministrationRepository administrationRepository)
{
this.administrationRepository = administrationRepository;
}
@GetMapping("signup")
public String showSignUpForm(Administration administration) {
return "add-student";
}
@GetMapping("list")
public String showUpdateForm(Model model) {
model.addAttribute("students",
administrationRepository.findAll());
return "index";
}
@PostMapping("add")
public String addadministration( Administration administration, BindingResult
result, Model model) {
if (result.hasErrors()) {
return "add-student";
}
administrationRepository.save(administration);
return "redirect:list";
}
@GetMapping("edit/{id}")
public String showUpdateForm(@PathVariable("id") Integer id, Model
model) {
Administration administration = administrationRepository.findById(id)
.orElseThrow(() -> new
IllegalArgumentException("Invalid student Id:" + id));
model.addAttribute("administration", administration);
return "update-administration";
}
@PostMapping("update/{id}")
public String updateAdministration(@PathVariable("id") Integer id,
Administration administration, BindingResult result,
Model model) {
if (result.hasErrors()) {
administration.setId(id);
return "update-administration";
}
administrationRepository.save(administration);
model.addAttribute("students",
administrationRepository.findAll());
return "index";
}
}