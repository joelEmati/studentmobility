/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ime.studentmobility.Services;

import com.ime.studentmobility.Repositories.CampusRepository;
import com.ime.studentmobility.entity.Campus;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BLACKSTAR
 */
@Service
public class CampusService {
    @Autowired
    private CampusRepository campustRepository;

    public void createCampus(Campus campus) {
        campustRepository.save(campus);
    }
    public List<Campus> getAll(){
        return campustRepository.findAll();
    }
    public Campus getOne(Integer id){
        return campustRepository.getById(id);
    }
    public void updateCampus(Campus campus){
        Campus s = campustRepository.getById(campus.getId());
        if (s != null) {
            campustRepository.save(campus);
        }
    }
    public void deleteCampus(Integer id) {
        campustRepository.deleteById(id);
    }
}