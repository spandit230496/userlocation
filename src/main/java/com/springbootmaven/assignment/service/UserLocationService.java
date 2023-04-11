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
        Optional<UserLocation> optionalUserLocation = userLocationDTO.findByName(userLocationDTO.getName()).get();
//
//
//    }
//    public void setUserLocationRepositor(UserLocationDTO userLocationDTO)
}
