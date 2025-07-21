package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Actor;

@Controller
public class DataRenderingController {
	
	@GetMapping("/data")
	public String showData(Map<String, Object> map) {
		//keeping simple values in shared memory.
		//==========================================
		map.put("Name", "Kumar");
		map.put("Age", 22);
		
		
		//keeping collections and arrays in shared memory.
		//================================================
		map.put("FavColors", new String[] {"red", "blue", "green"});
		map.put("Friends", List.of("Kandra", "Sudheer", "sunil", "Prashanth"));
		map.put("PhoneNumbers", Set.of(79812346L, 98293788L, 574626828L, 381686818L));
		map.put("IdDetails", Map.of("Adhar",273325556363L, "VoterId",345847686L));
		
		//keeping model object in a shared memory.
		//=========================================
		Actor actor = new Actor(5902, "Cillian Murphy", "Hero", 1000000L); 
		map.put("ActorInfo", actor);
		
		//keeping collection of model class objects in a shared memory.
		//=============================================================
		
		Actor actor1 = new Actor(10001, "Prabhas", "Hero", 200000L);
		Actor actor2 = new Actor(10002, "AlexendraDadario", "Herohine", 100000L);
		map.put("ActorsInfo", List.of(actor1,actor2));
		// return LVN
		return "show_result";
		
	}
	

}
