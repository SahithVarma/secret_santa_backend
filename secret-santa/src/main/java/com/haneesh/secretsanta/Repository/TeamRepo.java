package com.haneesh.secretsanta.Repository;

import com.haneesh.secretsanta.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface TeamRepo extends MongoRepository<Team,String> {

    Team findByUniqueCode(String uniqueCode);

    Boolean existsByUniqueCode(String uniqueCode);


}
