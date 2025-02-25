package com.example.users.infraestructure.service;

import com.example.users.infraestructure.UsersModel;
import com.example.users.infraestructure.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public List<UsersModel> getUsers() {
        return userRepository.findAll();
    }

    public UsersModel createUser(Number cpf,String name ,Number idade) {
        UsersModel user = new UsersModel(name, cpf, idade);
        return userRepository.save(user);
    }

    public UsersModel updateUser(Long id, Number cpf,String name ,Number idade) {
        Optional<UsersModel> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        UsersModel  user = optionalUser.get();
         if (name != null) user.setName(name);
         if (cpf != null) user.setCpf(cpf);
         if (idade != null) user.setIdade(idade);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        Optional<UsersModel > optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        userRepository.delete(optionalUser.get());
    }
}
