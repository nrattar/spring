package com.fundamental.repository;

import java.util.ArrayList;
import java.util.List;

import com.fundamental.model.Speaker;

public class SpeakerRepositoryImpl implements SpeakerRepository {
	
	/* (non-Javadoc)
	 * @see com.fundamental.repository.SpeakerRepository#findAll()
	 */
	public List<Speaker> findAll(){
		
		List <Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Tom");
		speaker.setLastName("Hiddleston");
		
		speakers.add(speaker);
		
		return speakers;
	}

}
