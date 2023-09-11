package com.barbosa.cardapio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbosa.cardapio.models.FoodResponseDTO;
import com.barbosa.cardapio.repositories.FoodRepository;

@Service
public class FoodServiceIpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

	@Override
	public FoodResponseDTO saveFood(FoodResponseDTO food) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'saveFood'");
	}

	@Override
	public List<FoodResponseDTO> foodList() {
		
        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        
        return foodList;
	}

	@Override
	public FoodResponseDTO updateFood(Long id, FoodResponseDTO food) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'updateFood'");
	}

	@Override
	public FoodResponseDTO deleteFoodById(Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteFoodById'");
	}

	@Override
	public FoodResponseDTO getFoodById(Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getFoodById'");
	}
    
}
