package com.demo.demo.entity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @NotNull(message = "Không được để trông id")
    private String mssv;
    private String tenSv;
    private String email;
    private byte gioiTinh;
    private String chuyenNganh;
    private Double gpa;
}
