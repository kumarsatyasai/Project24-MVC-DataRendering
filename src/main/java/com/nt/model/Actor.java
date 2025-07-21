package com.nt.model;

import lombok.AllArgsConstructor; 
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

	private int actorId;
	
	private String actorName;
	
	private String actorRole;
	
	private Long actorRemuneration;
	
}
