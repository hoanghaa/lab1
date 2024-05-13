package com.demo.demo.api;

import com.demo.demo.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeApi {
    @GetMapping("getInfomation")
    public ResponseEntity<?> doGetInfomation(@RequestBody Student student){
        Map<String,Object> result= new HashMap<String,Object>();
        try {
            result.put("success",true);
            result.put("message","call api success");
            result.put("success",student);
        }catch (Exception e){
            result.put("success",false);
            result.put("message","call api fail");
            result.put("success",null);
        }
        return ResponseEntity.ok(result);
    }
}
