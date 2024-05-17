package com.demo.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String Name;
    private int age;
    private String hometown;
    private String classes;
    private String address;
}
