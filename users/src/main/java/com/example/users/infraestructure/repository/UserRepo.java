package com.example.users.infraestructure.repository;

import com.example.users.infraestructure.UsersModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepo extends JpaRepository<UsersModel, Long> {

}
