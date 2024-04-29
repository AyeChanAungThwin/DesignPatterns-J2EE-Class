package io.github.ayechanaungthwin.design_patterns.structural.flyweight;

import lombok.ToString;

@ToString
public class Terrorist implements Player {

	private String task;
	private Weapon weapon;
	
	public Terrorist() {
		System.out.println("Terrorist obj is Created!");
		task = "Plant a bomb!";
	}
	
	@Override
	public void assignWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}
