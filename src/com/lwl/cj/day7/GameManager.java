package com.lwl.cj.day7;

import java.util.Scanner;

class One{
	void show() {
		System.out.println("Show");
	}
}
class Two extends One{
	void show() {
		System.out.println("Show of my own show");
	}
}

public class GameManager {
	public static void main(String[] args) {
		
		One obj = new Two();
		obj.show();
		
		Game game = getGameFromUserInput();
		game.start();
		game.play();
		game.stop();
	}

	private static Game getGameFromUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Bike 2.Car 3.Ship : Enter your choice: ");
		int ch = sc.nextInt();
		sc.close();
		if(ch==1) {
			return new Bike();
		}else if(ch==2) {
			return new Car();
		}else if(ch==3) {
			return new Ship();
		}
		throw new IllegalStateException("Please enter valid game type");
	}
}
