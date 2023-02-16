package com.fdmgroup.mammals;

public class AnimalApp {
	public static void main(String[] args) {
		Mammal m = new Dog();
		m.move();
		m.makeNoise();
		m.hibernate();
		//m.setBreed("");
	}
}
