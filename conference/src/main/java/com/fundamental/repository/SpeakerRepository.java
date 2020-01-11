package com.fundamental.repository;

import java.util.List;

import com.fundamental.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}