package com.example.tp1.controlers;

import com.example.tp1.models.Fav;
import com.example.tp1.repositories.FavRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/favs")
public class FavController {

    @Autowired
    private FavRepository favRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewFav (@RequestBody Fav fav) {
        favRepository.save(fav);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Fav> getAllFavs() {
        return favRepository.findAll();
    }

    @GetMapping(path="/remove")
    public @ResponseBody String removeFav(@RequestParam int id) {
        favRepository.deleteById(id);
        return "Deleted";
    }
}