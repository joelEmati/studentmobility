package com.ime.studentmobility.Controllers;


import com.ime.studentmobility.Repositories.RequestRepository;
import com.ime.studentmobility.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/request/")
public class RequestController {
private final RequestRepository requestRepository;
@Autowired
public RequestController(RequestRepository requestRepository)
{
this.requestRepository = requestRepository;
}
@GetMapping("signup")
public String showSignUpForm(Request request) {
return "add-request";
}
@GetMapping("list")
public String showUpdateForm(Model model) {
model.addAttribute("request",
requestRepository.findAll());
return "index";
}
@PostMapping("add")
public String addRequest( Request request, BindingResult
result, Model model) {
if (result.hasErrors()) {
return "add-request";
}
requestRepository.save(request);
return "redirect:list";
}
@GetMapping("edit/{id}")
public String showUpdateForm(@PathVariable("id") Integer id, Model
model) {
Request request = requestRepository.findById(id)
.orElseThrow(() -> new
IllegalArgumentException("Invalid student Id:" + id));
model.addAttribute("request", request);
return "update-request";
}
@PostMapping("update/{id}")
public String updateRequest(@PathVariable("id") Integer id,
Request request, BindingResult result,
Model model) {
if (result.hasErrors()) {
request.setId(id);
return "update-request";
}
requestRepository.save(request);
model.addAttribute("students",
requestRepository.findAll());
return "index";
}
}