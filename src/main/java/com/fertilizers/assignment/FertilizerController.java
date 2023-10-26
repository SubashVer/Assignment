package com.fertilizers.assignment;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FertilizerController {
	@RequestMapping("hello")
	public String hello() {
		return "Hello World!";
		
	}
	@Autowired
	private FertilizerService fertilizerService;

	@RequestMapping("/fertilizers")
	public List<Fertilizer> getFertilizers() {
		return fertilizerService.getFertilizers();
		/*
		 * Uncomment this for Step1
		 * 
		 *  return Arrays.asList( new Fertilizer("Infosys",
		 * "Infosys India Pvt Ltd.", 100000), new Fertilizer("Oracle",
		 * "Oracle India Pvt Ltd.", 50000), new Fertilizer("MI",
		 * "MobileIron India Pvt Ltd.", 850) );
		 */

	}
	
	@RequestMapping(method=RequestMethod.POST, value="/fertilizers")
	public void addFertilizer(@RequestBody Fertilizer fertilizer) {
		fertilizerService.addfertilizer(fertilizer);
	}
	
	@RequestMapping("/fertilizers/{name}")
	public Optional<Fertilizer> getFertilizer(@PathVariable String name){
		System.out.println("Inside getFertilizer");
		return fertilizerService.getFertilizer(name);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/fertilizers/{name}")
	public void updateFertilizer(@RequestBody Fertilizer fertilizer, @PathVariable String name) {
		System.out.println("inside updateFertilizer");
		fertilizerService.updatefertilizer(name, fertilizer);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/fertilizers/{name}")
	public void deleteFertilizer(@PathVariable String name){
		System.out.println("Inside deleteFertilizer");
		fertilizerService.deletefertilizer(name);
	}

}
