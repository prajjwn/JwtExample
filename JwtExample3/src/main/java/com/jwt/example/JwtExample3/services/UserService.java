package com.jwt.example.JwtExample3.services;

import com.jwt.example.JwtExample3.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Durgesh Tiwari", "durgeshT@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ankit Tiwari", "AnkiT@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Manoj Tiwari", "manojT@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Durgesh Singh", "durgeshSingh@gmail.com"));
    }
    public List<User> getStore(){
        return this.store;
    }
}
