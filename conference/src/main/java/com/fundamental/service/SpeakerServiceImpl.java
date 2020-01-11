package com.fundamental.service;

import java.util.List;

import com.fundamental.model.Speaker;
import com.fundamental.repository.*;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository speakerRepository = new SpeakerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.fundamental.service.SpeakerService#findAll()
	 */
	public List<Speaker> findAll(){
		
		return speakerRepository.findAll();
	}

}
