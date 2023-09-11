package com.barbosa.cardapio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbosa.cardapio.models.FoodResponseDTO;
import com.barbosa.cardapio.services.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<FoodResponseDTO> getAll(){
        
        return foodService.foodList();
    }
}
