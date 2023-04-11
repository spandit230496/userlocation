package com.springbootmaven.assignment.service;

import com.springbootmaven.assignment.dto.UserLocationDTO;
import com.springbootmaven.assignment.modal.UserLocation;
import com.springbootmaven.assignment.repository.UserLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.apache.coyote.http11.Constants.a;

@Service
public class UserLocationService {
    @Autowired
    UserLocationRepository userLocationRepository;

    public void saveUserLocation(UserLocationDTO userLocationDTO) {
        UserLocation userLocation = new UserLocation();
        userLocation.setName(userLocationDTO.getName());
        userLocation.setLongitude(userLocationDTO.getLongitude());
        userLocation.setLatitude(userLocationDTO.getLongitude());

        userLocationRepository.save(userLocation);
    }

    public void updateUserLocation(UserLocationDTO userLocationDTO) {
        try {
            UserLocation userLocation = userLocationRepository.findByName(userLocationDTO.getName());
            userLocation.setLongitude(userLocation.getLongitude());
            userLocation.setLatitude(userLocationDTO.getLatitude());

            userLocationRepository.save(userLocation);
        }
        catch (Exception e){
            throw new RuntimeException("User not Found");
        }


    }

    }

