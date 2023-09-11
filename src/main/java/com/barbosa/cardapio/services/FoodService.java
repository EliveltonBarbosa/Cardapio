package com.barbosa.cardapio.services;

import java.util.List;

import com.barbosa.cardapio.models.FoodResponseDTO;

public interface FoodService {

    FoodResponseDTO saveFood(FoodResponseDTO food);

    public List<FoodResponseDTO> foodList();

    public FoodResponseDTO updateFood(Long id, FoodResponseDTO food);

    public FoodResponseDTO deleteFoodById(Long id);

    public FoodResponseDTO getFoodById(Long id);
    
}
