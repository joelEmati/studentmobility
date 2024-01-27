
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ime.studentmobility.Repositories;

import com.ime.studentmobility.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BLACKSTAR
 */
@Repository
public interface RequestRepository extends JpaRepository<Request, Integer>{
@Query("SELECT s FROM Student s WHERE s.id = :id")
public Request getById(@Param("id")Integer id) ;
}