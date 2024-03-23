package com.haneesh.secretsanta.Repository;

import com.haneesh.secretsanta.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
    User findByName(String name);

    List<User> findAllByUniqueCode(String code);

    int countByUniqueCode(String code);

    boolean existsByNameAndUniqueCode(String name, String uniqueCode);

    @Query("{ 'name': ?0, 'uniqueCode': ?1 }")
    User findByNameAndUniqueCode(String name, String code);
}
