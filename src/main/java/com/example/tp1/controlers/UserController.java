package com.example.tp1.controlers;

import com.example.tp1.models.User;
import com.example.tp1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestBody User user) {
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping(path="/remove")
    public @ResponseBody String removeUser(@RequestParam int id) {
        userRepository.deleteById(id);
        return "Deleted";
    }

    @PatchMapping(path="/update")
    public @ResponseBody String updateUser(@RequestBody User user) {
        userRepository.save(user);
        return "Updated";
    }
}