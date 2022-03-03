package com.himani.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himani.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
