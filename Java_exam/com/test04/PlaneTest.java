package com.test04;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane과 Cargoplane 객체생성
		Airplane airplane = new Airplane();
		airplane.setPlaneName("L777");
		airplane.setFuelSize(1000);
		
		Cargoplane cargoplane = new Cargoplane();
		cargoplane.setPlaneName("C50");
		cargoplane.setFuelSize(1000);
		
		// 생성된 객체의 정보 출력
		System.out.println("Plane fuelSize-----------------");
		System.out.printf("%s %d\n",airplane.getPlaneName(), airplane.getFuelSize());
		System.out.printf("%s %d\n",cargoplane.getPlaneName(), cargoplane.getFuelSize());
		
		// Airplane과 Cargoplane 객체에 100씩 운항
		// 운항후 객체의 변경된 정보 출력
		System.out.println("100 운항");
		System.out.println("Plane fuelSize-----------------");
		airplane.flight(100);
		cargoplane.flight(100);
		System.out.printf("%s %d\n",airplane.getPlaneName(), airplane.getFuelSize());
		System.out.printf("%s %d",cargoplane.getPlaneName(), cargoplane.getFuelSize());
		System.out.println();
		
		// Airplane과 Cargoplane 객체에 200씩 주유
		// 주유후 객체의 변경된 정보 출력
		System.out.println("200 주유");
		System.out.println("Plane fuelSize-----------------");
		airplane.refuel(200);
		cargoplane.refuel(200);
		System.out.printf("%s %d\n",airplane.getPlaneName(), airplane.getFuelSize());
		System.out.printf("%s %d",cargoplane.getPlaneName(), cargoplane.getFuelSize());

	}

}

//Plane fuelSize-------------------
//L777 1000
//C50 1000
//100 운항
//Plane fuelSize-------------------
//L777 700
//C50 500
//200 주유
//Plane fuelSize-------------------
//L777 900
//C50 700