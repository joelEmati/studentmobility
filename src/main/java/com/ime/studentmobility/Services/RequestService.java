/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ime.studentmobility.Services;

import com.ime.studentmobility.Repositories.RequestRepository;
import com.ime.studentmobility.entity.Request;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BLACKSTAR
 */
@Service
public class RequestService {
    @Autowired
    private RequestRepository requesttRepository;

    public void createRequest(Request request) {
        requesttRepository.save(request);
    }
    public List<Request> getAll(){
        return requesttRepository.findAll();
    }
    public Request getOne(Integer id){
        return requesttRepository.getById(id);
    }
    public void updateRequest(Request request){
        Request s = requesttRepository.getById(request.getId());
        if (s != null) {
            requesttRepository.save(request);
        }
    }
    public void deleteRequest(Integer id) {
        requesttRepository.deleteById(id);
    }
}