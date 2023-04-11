package com.springbootmaven.assignment.controller;

import com.springbootmaven.assignment.dto.UserLocationDTO;
import com.springbootmaven.assignment.modal.UserLocation;
import com.springbootmaven.assignment.service.UserLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserLocationService userLocationService;

    @PostMapping("/save")
    public UserLocationDTO saveUserLocation(UserLocationDTO userLocationDTO){
     userLocationService.saveUserLocation(userLocationDTO);

     return userLocationDTO;
    }

//    @PostMapping("/update")
//    public
}
