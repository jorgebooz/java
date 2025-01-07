package com.jorgebooz.user_register.service;

import com.jorgebooz.user_register.model.Users;
import com.jorgebooz.user_register.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {


    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users save(Users user) {
        return userRepository.save(user);
    }

    @Query("SELECT * FROM users")
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users findId(Long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }


    public void delete(Long id){
        userRepository.deleteById(id);
    }

}
