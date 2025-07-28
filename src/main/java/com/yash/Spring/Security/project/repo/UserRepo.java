package com.yash.Spring.Security.project.repo;

import com.yash.Spring.Security.project.model.Users;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username) ;
}
