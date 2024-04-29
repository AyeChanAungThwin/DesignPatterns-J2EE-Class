package io.github.ayechanaungthwin.design_patterns.structural.flyweight;

import lombok.ToString;

@ToString
public class CounterTerrorist implements Player {

	private String task;
	private Weapon weapon;
	
	public CounterTerrorist() {
		System.out.println("CounterTerrorist obj is Created!");
		task = "Diffuse a bomb!";
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
