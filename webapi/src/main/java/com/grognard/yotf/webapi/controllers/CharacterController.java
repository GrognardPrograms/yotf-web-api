package com.grognard.yotf.webapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    @CrossOrigin
    @PostMapping("/character")
    public int PostCharacter() {
        return 1;
    }

    @CrossOrigin
    @GetMapping("/character/{id}")
    public int GetCharacter(@PathVariable long id){
        if(id == 0) {
            return 55;
        }

        return 44;
    }

    @CrossOrigin
    @GetMapping(value = {"/character/search/", "/character/search/{name}"})
    public String[] GetCharacterSearch(@PathVariable(required = false) String name) {
        String[] characters = {"Bob", "Rob", "Job"};
        String[] f = {};

        if(name != null && !name.equals("f")) {
            return characters;
        }

        return f;
    }

    @CrossOrigin
    @PutMapping("/character/{id}")
    public int PutCharacter(@PathVariable long id) {
        return 2;
    }

    @CrossOrigin
    @DeleteMapping("/character/{id}")
    public int DeleteCharacter(@PathVariable long id) {
        return 3;
    }
}