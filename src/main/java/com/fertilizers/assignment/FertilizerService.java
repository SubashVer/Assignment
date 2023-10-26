package com.fertilizers.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FertilizerService {
	@Autowired
	private FertilizerDAORepository fertilizerDAORepository;
	
	public List<Fertilizer> getFertilizers(){
		List<Fertilizer> FertilizerList = new ArrayList<Fertilizer>();
		fertilizerDAORepository.findAll().forEach(FertilizerList::add);
		return FertilizerList;
		
	}
	public Optional<Fertilizer> getFertilizer(String id) {
		return fertilizerDAORepository.findById(id)
;
	}
	
	public void updatefertilizer(String id, Fertilizer fertilizer) {
		fertilizerDAORepository.save(fertilizer);
	}

	public void deletefertilizer(String id) {
		fertilizerDAORepository.deleteById(id)
;
	}

	
	public void addfertilizer(Fertilizer fertilizer) {
		fertilizerDAORepository.save(fertilizer);
	}
}
