package com.fundamental;

import com.fundamental.service.SpeakerService;
import com.fundamental.service.SpeakerServiceImpl;

public class Application{
	
	public static void main(String[] args) {
		
		SpeakerService speakerService = new SpeakerServiceImpl();
		System.out.println(speakerService.findAll().get(0));
		
	}

}
