package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class Base extends Fixed{
	private int sequenceNumber;
	
	public Base(){
		super.setSize(10);
		super.setColor(ColorUtil.rgb(ColorUtil.MAGENTA, ColorUtil.MAGENTA, ColorUtil.MAGENTA));
	}
	
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	
	/*Sequence will be updated through game play*/
}
