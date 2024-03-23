package com.haneesh.secretsanta.Repository;

import com.haneesh.secretsanta.Model.Task;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

@Repository
public interface TaskRepo extends MongoRepository<Task,String> {
@Query("{ 'uniqueCode': ?0 }")
Page<Task> findByUniqueCode(String uniqueCode, Pageable pageable);

}
