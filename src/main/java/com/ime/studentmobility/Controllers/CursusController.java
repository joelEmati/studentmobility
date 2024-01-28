package com.ime.studentmobility.Controllers;


import com.ime.studentmobility.Repositories.CursusRepository;
import com.ime.studentmobility.entity.Cursus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/cursus/")
public class CursusController {
private final CursusRepository cursusRepository;
@Autowired
public CursusController(CursusRepository cursusRepository)
{
this.cursusRepository = cursusRepository;
}
@GetMapping("signup")
public String showSignUpForm(Cursus cursus) {
return "add-cursus";
}
@GetMapping("list")
public String showUpdateForm(Model model) {
model.addAttribute("cursus",
cursusRepository.findAll());
return "index";
}
@PostMapping("add")
public String addCursus( Cursus cursus, BindingResult
result, Model model) {
if (result.hasErrors()) {
return "add-cursus";
}
cursusRepository.save(cursus);
return "redirect:list";
}
@GetMapping("edit/{id}")
public String showUpdateForm(@PathVariable("id") Integer id, Model
model) {
Cursus cursus = cursusRepository.findById(id)
.orElseThrow(() -> new
IllegalArgumentException("Invalid cursus Id:" + id));
model.addAttribute("cursus", cursus);
return "update-cursus";
}
@PostMapping("update/{id}")
public String updateCursus(@PathVariable("id") Integer id,
Cursus cursus, BindingResult result,
Model model) {
if (result.hasErrors()) {
cursus.setId(id);
return "update-cursus";
}
cursusRepository.save(cursus);
model.addAttribute("cursus",
cursusRepository.findAll());
return "index";
}
}