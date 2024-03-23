package com.haneesh.secretsanta.Repository;

import com.haneesh.secretsanta.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task,Integer> {
    @Query(value = "SELECT * FROM task t WHERE t.unique_code = :code ORDER BY timestamp DESC LIMIT  :count", nativeQuery = true)
    List<Task> fetchByUniqueCodeOrderByCreated(String code, int count);


}
