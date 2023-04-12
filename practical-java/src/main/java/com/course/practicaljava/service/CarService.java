package com.course.practicaljava.service;

import java.util.List;

import com.course.practicaljava.entity.Car;

public interface CarService {
	List<String> BRANDS = List.of("Toyota", "Honda", "Ford", "BMW", "Mitsubishi");
	List<String> COLORS = List.of("Red", "Black", "White", "Blue", "Yellow");
	List<String> TYPES = List.of("Sedan", "SUV", "MPV", "Convertible", "Hatchback");
	List<String> ADDITIONAL_FEATURES = List.of("Alarm", "GPS", "Sunroof", "Media player", "Leather seats");
	List<String> FUELS = List.of("Patrol", "Electric", "Hybrid");
	List<String> TIRE_MANUFACTURERS = List.of("Goodyear", "Bridgestone", "Dunlop");

	Car generateCar();
}
