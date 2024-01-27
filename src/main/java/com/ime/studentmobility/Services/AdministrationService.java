/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ime.studentmobility.Services;

import com.ime.studentmobility.Repositories.AdministrationRepository;
import com.ime.studentmobility.entity.Administration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BLACKSTAR
 */
@Service
public class AdministrationService {
    @Autowired
    private AdministrationRepository administrationtRepository;

    public void createAdministration(Administration administration) {
        administrationtRepository.save(administration);
    }
    public List<Administration> getAll(){
        return administrationtRepository.findAll();
    }
    public Administration getOne(Integer id){
        return administrationtRepository.getById(id);
    }
    public void updateAdministration(Administration administration){
        Administration s = administrationtRepository.getById(administration.getId());
        if (s != null) {
            administrationtRepository.save(administration);
        }
    }
    public void deleteAdministration(Integer id) {
        administrationtRepository.deleteById(id);
    }
}