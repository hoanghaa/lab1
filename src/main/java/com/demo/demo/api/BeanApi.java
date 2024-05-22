package com.demo.demo.api;

import com.demo.demo.bean.SchoolInfomation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java5_v5/bean")
public class BeanApi {
    @Autowired
//    @Qualifier("SchoolInfomationConfig")
    SchoolInfomation schoolInfomation;

    @GetMapping("/getBeanInfomation")
    public ResponseEntity<?> doGetBeanInfomation(){
//        SchoolInfomation bean=new SchoolInfomation("FPT polytechnic","Quan 12");
        return ResponseEntity.ok(schoolInfomation);
    }
}
