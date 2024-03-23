package com.haneesh.secretsanta.Repository;

import com.haneesh.secretsanta.Model.Santa;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SantaRepo extends MongoRepository<Santa,String> {
    List<Santa> findByUniqueCode(String code);
    @Query("{ 'santa': ?0, 'uniqueCode': ?1 }")
    Santa findBySantaAndUniqueCode(String user, String code);
}
