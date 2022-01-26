package com.code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//create the object
		Coach theCoach=new TrackCoach();
		//use the object
		//theCoach is just a generic interface
		System.out.println(theCoach.getDailyWorkout());
	}

}
