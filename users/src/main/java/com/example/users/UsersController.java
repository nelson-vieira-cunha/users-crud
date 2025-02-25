package com.example.users;

import com.example.users.infraestructure.UsersModel;
import com.example.users.infraestructure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public  ResponseEntity<List<UsersModel>>get() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping("/hello")
    public UsersModel add(@RequestBody UsersModel user){
        return userService.createUser(user.getCpf(), user.getName(), user.getIdade());
    }

    @PutMapping("/hello/{id}")
    public UsersModel update(@PathVariable Long id,@RequestBody UsersModel user){
        return userService.updateUser(id, user.getCpf(), user.getName(), user.getIdade());
    }

    @DeleteMapping("/hello/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}