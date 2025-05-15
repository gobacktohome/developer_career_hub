package com.example.oracleclouddb.backend.controller;

import com.example.oracleclouddb.backend.entity.Jobs;
import com.example.oracleclouddb.backend.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")  // <<== 추가
@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    @Autowired
    private JobsRepository jobsRepository;

    @GetMapping
    public ResponseEntity<?> getAllJobs() {
        System.out.println("✅ Jobs API 진입");
        List<Jobs> list = jobsRepository.findAll();
        System.out.println("📦 불러온 데이터 수: " + list.size());
        return ResponseEntity.ok(list);
    }
}
