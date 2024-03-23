package com.haneesh.secretsanta.Repository;

import com.haneesh.secretsanta.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByName(String name);

    List<User> findAllByUniqueCode(String code);

    @Query(value = "select count(*) from user u where u.unique_code =:code",nativeQuery = true)
    int getUsersCountByUniqueCode(String code);
    @Query(value = "select u.name from user u where u.unique_code =:code",nativeQuery = true)
    List<String> getAllUserNamesByUniqueCode(String code);

    boolean existsByName(String name);

    boolean existsByNameAndUniqueCode(String name, String uniqueCode);

    User findByNameAndUniqueCode(String name, String code);
}
