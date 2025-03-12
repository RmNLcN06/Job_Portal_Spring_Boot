package com.rmnlcn.Job_Portal_Spring_Boot.repositories;

import com.rmnlcn.Job_Portal_Spring_Boot.entities.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
}
