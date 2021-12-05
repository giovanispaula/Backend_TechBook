package com.techbook.techbook.repositories;

import com.techbook.techbook.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfileRepository extends JpaRepository<Profile, Integer> {
}
