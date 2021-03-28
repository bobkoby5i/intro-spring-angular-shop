package com.koby5i.shop.service;

import com.koby5i.shop.model.User;
import com.koby5i.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPassword("BCRYPT TO DO with passwordEncoder");
        return userRepository.save(user);
    }


    @Override
    public User updateUser(User user){
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Long numberOfUsers(){
        return userRepository.count();
    }
}
