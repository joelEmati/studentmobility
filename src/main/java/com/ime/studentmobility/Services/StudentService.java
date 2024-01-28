/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ime.studentmobility.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ime.studentmobility.Repositories.StudentRepository;
import com.ime.studentmobility.entity.Student;

/**
 *
 * @author BLACKSTAR
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void createStudent(Student student) {
        studentRepository.save(student);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Student getOne(Integer id){
        return studentRepository.getById(id);
    }
    public void updateStudent(Student student){
        Student s = studentRepository.getById(student.getId());
        if (s != null) {
            studentRepository.save(student);
        }
    }
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}