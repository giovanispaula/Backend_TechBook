package com.techbook.techbook.services;


import com.techbook.techbook.entities.Profile;
import com.techbook.techbook.repositories.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private IProfileRepository profileRepository;

    public List<Profile> listProfiles() {
        return profileRepository.findAll();
    }

}
