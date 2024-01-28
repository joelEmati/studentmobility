package com.ime.studentmobility.Controllers;


import com.ime.studentmobility.Repositories.CampusRepository;
import com.ime.studentmobility.entity.Campus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/campus/")
public class CampusController {
private final CampusRepository campusRepository;
@Autowired
public CampusController(CampusRepository campusRepository)
{
this.campusRepository = campusRepository;
}
@GetMapping("signup")
public String showSignUpForm(Campus campus) {
return "add-campus";
}
@GetMapping("list")
public String showUpdateForm(Model model) {
model.addAttribute("campus",
campusRepository.findAll());
return "index";
}
@PostMapping("add")
public String addCampus( Campus campus, BindingResult
result, Model model) {
if (result.hasErrors()) {
return "add-campus";
}
campusRepository.save(campus);
return "redirect:list";
}
@GetMapping("edit/{id}")
public String showUpdateForm(@PathVariable("id") Integer id, Model
model) {
Campus campus = campusRepository.findById(id)
.orElseThrow(() -> new
IllegalArgumentException("Invalid campus Id:" + id));
model.addAttribute("campus", campus);
return "update-campus";
}
@PostMapping("update/{id}")
public String updateCampus(@PathVariable("id") Integer id,
Campus campus, BindingResult result,
Model model) {
if (result.hasErrors()) {
campus.setId(id);
return "update-campus";
}
campusRepository.save(campus);
model.addAttribute("campus",
campusRepository.findAll());
return "index";
}
}