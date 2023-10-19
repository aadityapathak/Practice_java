package com.entity.human1;

public class exampleStatic {
	public static void game() {
		System.out.println("Lets play a Game ");
	}

	public void snake() {
		System.out.println("Lets play Students ");
	}

	public static void main(String[] args) {
		int x = 10;
		exampleStatic s = new exampleStatic();
		s.snake();
		game();
	}

}
