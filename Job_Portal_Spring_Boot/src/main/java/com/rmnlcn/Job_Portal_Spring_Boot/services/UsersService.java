package com.rmnlcn.Job_Portal_Spring_Boot.services;

import com.rmnlcn.Job_Portal_Spring_Boot.entities.JobSeekerProfile;
import com.rmnlcn.Job_Portal_Spring_Boot.entities.RecruiterProfile;
import com.rmnlcn.Job_Portal_Spring_Boot.entities.Users;
import com.rmnlcn.Job_Portal_Spring_Boot.repositories.JobSeekerProfileRepository;
import com.rmnlcn.Job_Portal_Spring_Boot.repositories.RecruiterProfileRepository;
import com.rmnlcn.Job_Portal_Spring_Boot.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;
    private final JobSeekerProfileRepository jobSeekerProfileRepository;
    private final RecruiterProfileRepository recruiterProfileRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository, JobSeekerProfileRepository jobSeekerProfileRepository, RecruiterProfileRepository recruiterProfileRepository) {
        this.usersRepository = usersRepository;
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    public Users addNewUser(Users users) {
        users.setActive(true);
        users.setRegistrationDate(new Date(System.currentTimeMillis()));
        Users savedUser = usersRepository.save(users);
        int userTypeId = users.getUserTypeId().getUserTypeId();

        if(userTypeId == 1)
        {
            recruiterProfileRepository.save(new RecruiterProfile(savedUser));
        }
        else
        {
            jobSeekerProfileRepository.save(new JobSeekerProfile(savedUser));
        }

        return savedUser;
    }

    public Optional<Users> getUserByEmail(String email) {
        return usersRepository.findByEmail(email);
    }
}
