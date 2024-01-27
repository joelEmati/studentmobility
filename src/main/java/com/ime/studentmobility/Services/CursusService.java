/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ime.studentmobility.Services;

import com.ime.studentmobility.Repositories.CursusRepository;
import com.ime.studentmobility.entity.Cursus;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BLACKSTAR
 */
@Service
public class CursusService {
    @Autowired
    private CursusRepository cursustRepository;

    public void createCursus(Cursus cursus) {
        cursustRepository.save(cursus);
    }
    public List<Cursus> getAll(){
        return cursustRepository.findAll();
    }
    public Cursus getOne(Integer id){
        return cursustRepository.getById(id);
    }
    public void updateCursus(Cursus cursus){
        Cursus s = cursustRepository.getById(cursus.getId());
        if (s != null) {
            cursustRepository.save(cursus);
        }
    }
    public void deleteCursus(Integer id) {
        cursustRepository.deleteById(id);
    }
}