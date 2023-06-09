package com.springbootmaven.assignment.repository;

import com.springbootmaven.assignment.modal.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserLocationRepository extends JpaRepository<UserLocation,Integer> {
    UserLocation findByName(String name);
}
