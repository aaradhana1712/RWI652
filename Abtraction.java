package com.abs;

abstract class veh{
	abstract void start();
}
class ca extends veh{
	void start() {
		System.out.println("start car");
	}
	
}
class bike extends veh{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("bike start");
	}
	
}

public class Abtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		ca c = new ca();
		c.start();
		bike b = new bike();
		b.start();

	}

}
