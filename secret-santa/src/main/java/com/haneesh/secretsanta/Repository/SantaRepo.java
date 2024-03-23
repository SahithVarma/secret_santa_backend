package com.haneesh.secretsanta.Repository;

import com.haneesh.secretsanta.Model.Santa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SantaRepo extends JpaRepository<Santa,Integer> {
    List<Santa> findByUniqueCode(String code);

    Santa findBySantaAndUniqueCode(String user, String code);
}
