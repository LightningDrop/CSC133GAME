package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;

public class EnergyStation extends Fixed {
	public EnergyStation() {
		super.setSize(returnRandomNumber());
		super.setColor(ColorUtil.rgb(ColorUtil.BLUE, ColorUtil.GREEN, ColorUtil.YELLOW));
	}
	
	private int returnRandomNumber() {
		Random rand = new Random();
		int low = 10;
		int high = 50;
	
		int num = rand.nextInt(high - low) + low;
	
		return num;
	}
	
}
