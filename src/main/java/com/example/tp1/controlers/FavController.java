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

    @GetMapping(path="/get")
    public @ResponseBody Fav getFav(@RequestParam int id) {
        if (favRepository.findById(id).isPresent()){
            return favRepository.findById(id).get();
        }
        return null;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewFav (@RequestBody Fav fav) {
        favRepository.save(fav);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Fav> getAllFavs() {
        return favRepository.findAll();
    }

    @DeleteMapping(path="/remove")
    public @ResponseBody String removeFav(@RequestParam int id) {
        favRepository.deleteById(id);
        return "Deleted";
    }

    @PatchMapping(path="/update")
    public @ResponseBody String updateFav(@RequestBody Fav fav) {
        favRepository.save(fav);
        return "Updated";
    }
}