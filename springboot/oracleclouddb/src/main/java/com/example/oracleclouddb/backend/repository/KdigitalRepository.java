package com.example.oracleclouddb.backend.repository;

import com.example.oracleclouddb.backend.entity.Kdigital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KdigitalRepository extends JpaRepository <Kdigital, String>{
    //기본적인 findAll(), save(), delete()등 자동 생성됨
}