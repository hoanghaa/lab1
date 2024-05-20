package com.demo.demo.api;

import com.demo.demo.dto.SinhVienDTO;
import com.demo.demo.entity.Student;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeApi {
    @GetMapping("/getStudentInformation")
    public ResponseEntity<?> doGetStudentInformation(Student student){
        Map <String, Object> result = new HashMap<>();
        result.put("message","Call api success");
        result.put("status",true);
        result.put("data",student);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/postStudentInformation")
    public ResponseEntity<?> doPostStudentInformation(@Valid @RequestBody SinhVienDTO student){
        Map <String, Object> result = new HashMap<>();
        result.put("message","Call api success");
        result.put("status",true);
        result.put("data",student);
        return ResponseEntity.ok(result);
    }
}
