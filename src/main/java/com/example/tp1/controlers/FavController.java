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




}