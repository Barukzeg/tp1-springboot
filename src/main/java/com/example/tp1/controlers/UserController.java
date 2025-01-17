package com.example.tp1.controlers;

import com.example.tp1.models.User;
import com.example.tp1.models.User.Role;
import com.example.tp1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/get")
    public @ResponseBody User getUser(@RequestParam int id) {
        if (userRepository.findById(id).isPresent()){
            return userRepository.findById(id).get();
        }
        return null;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String pseudo, @RequestParam String mdp, @RequestParam Role role) {
        User n = new User();
        n.setPseudo(pseudo);
        n.setMotDePasse(mdp);
        n.setRole(role);
        userRepository.save(n);
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