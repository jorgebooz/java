package com.jorgebooz.user_register.service;

import com.jorgebooz.user_register.model.User;
import com.jorgebooz.user_register.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> listAll(){
        return userRepository.findAll();
    }

    public User findId(Long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

}
