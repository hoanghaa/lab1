package com.demo.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeApi {
    @GetMapping("getInfomation")
    public ResponseEntity<?> doGetInfomation(@RequestParam("ten") String name
                                            ,@RequestParam("tuoi") String age){
        Map<String,String> result= new HashMap<String,String>();
        result.put("ten",name);
        result.put("tuoi",age);
        result.put("lop","java5");
        return ResponseEntity.ok(result);
    }

    @GetMapping("getInfomationWithPathVariable/{ten}")
    public ResponseEntity<?> doGetInfomationWithPathVariable(@PathVariable String ten){
        return ResponseEntity.ok(ten);
    }
}
