package org.jsp.controller;

import org.jsp.dao.CarEngineDao;
import org.jsp.dto.Car;
import org.jsp.dto.Engine;

public class EngineController {
	public static void main(String[] args) {
		Car car=new Car();
		car.setId(101);
		car.setBrandName("oms");
		car.setCost(900);
		
		Engine engine=new Engine();
		engine.setId(1);
		engine.setBrandName("omha");
		engine.setCc(9);
		engine.setMilage(9.5);
		
		engine.setCar(car);
		car.setEngine(engine);
		CarEngineDao dao =new CarEngineDao();
		dao.car(car);
		//dao.saveEngine(engine);
		//dao.updateEngine(engine);
		//dao.removeEngine(engine);
		//dao.findEngineById(1);
		
		//1.car has a engine and engine has car
		//car.setEngine(engine);
		//engine.setCar(car);
		//dao.saveCar(car);
		
		//2.Engine has car and car has engine
		//engine.setCar(car);
		//car.setEngine(engine);
		//dao.saveEngine(engine);
		
		//3.car has engine but engine does not have car
		//car.setEngine(engine);
		//dao.saveCar(car);
		
		//4.engine has car but car does not have engine
		//engine.setCar(car);
		//dao.saveEngine(engine);
		dao.findCarById(108); 
		
		
		
	}

}
