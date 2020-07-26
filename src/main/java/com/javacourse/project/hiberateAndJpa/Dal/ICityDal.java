package com.javacourse.project.hiberateAndJpa.Dal;
import java.util.List;

import com.javacourse.project.hiberateAndJpa.Entities.City;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
}
