package com.rmnlcn.Job_Portal_Spring_Boot.services;

import com.rmnlcn.Job_Portal_Spring_Boot.entities.UsersType;
import com.rmnlcn.Job_Portal_Spring_Boot.repositories.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAllUsersType() {
        return usersTypeRepository.findAll();
    }
}
