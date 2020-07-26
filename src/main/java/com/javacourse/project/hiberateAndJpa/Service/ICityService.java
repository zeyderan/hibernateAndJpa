package com.javacourse.project.hiberateAndJpa.Service;

import java.util.List;

import com.javacourse.project.hiberateAndJpa.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
}
