package com.techbook.techbook.controllers;

import com.techbook.techbook.entities.Profile;
import com.techbook.techbook.services.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    //exibe todos os perfis
    @GetMapping
    public ResponseEntity<List<Profile>> listProfiles() {
        return ResponseEntity.ok(profileService.listProfiles());
    }

}
