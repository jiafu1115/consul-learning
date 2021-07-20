package com.example.consullearning.qualifiertest;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ServiceImpl {

    @MyAnnotation
    @Autowired
    List<Student> list;
}
