package com.mycompany.a1;

import com.codename1.charts.models.*;

public abstract class GameObject {
		//variables
		private int size;
		private float X,Y;
		private int color;
		
		//methods
		public int getSize() {
			return size;
		}
		
		public void setSize(int size) {
			this.size = size;
		}
		
		public void setColor(int color) {
			this.color = color;
		}
		
		public int getColor() {
			 return color;
		}
		
		
		
		public abstract void setY(float Y);
		public abstract float getY();
		public abstract void setX(float X);
		public abstract float getX();
}

