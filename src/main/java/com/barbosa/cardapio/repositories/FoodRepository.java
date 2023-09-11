package com.barbosa.cardapio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbosa.cardapio.models.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{
    
}
