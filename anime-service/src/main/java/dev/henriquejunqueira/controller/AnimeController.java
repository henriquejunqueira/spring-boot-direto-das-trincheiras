package dev.henriquejunqueira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/animes")
public class AnimeController {
    // *** Exercício 01 ***

    @GetMapping
    public List<String> listAll(){
        return List.of("One Piece", "Naruto Shippuden");
    }

}
