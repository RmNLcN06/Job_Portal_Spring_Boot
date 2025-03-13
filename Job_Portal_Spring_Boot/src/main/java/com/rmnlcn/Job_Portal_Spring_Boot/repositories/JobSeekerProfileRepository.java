package com.rmnlcn.Job_Portal_Spring_Boot.repositories;

import com.rmnlcn.Job_Portal_Spring_Boot.entities.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}
