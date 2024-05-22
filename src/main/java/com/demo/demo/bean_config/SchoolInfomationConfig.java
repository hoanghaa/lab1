package com.demo.demo.bean_config;

import com.demo.demo.bean.SchoolInfomation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolInfomationConfig {

    @Bean("SchoolInfomationConfig")
    public SchoolInfomation schoolInfomationConfig(){
        SchoolInfomation schoolInfomation=new SchoolInfomation();
        schoolInfomation.setFullname("FPT polytechnic");
        schoolInfomation.setLocation("TP Hồ Chí Minh");
        return schoolInfomation;
    }
}
