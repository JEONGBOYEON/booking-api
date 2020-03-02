package com.crbs.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crbs.model.Car;

@Repository
public class CarRepositoryImple implements CarRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Car> getAvailableCarList() {
		return this.jdbcTemplate.query(CarSQLquery.SELECT_AVAILABLE_CAR, new CarSelectionMapper());
	}
}
