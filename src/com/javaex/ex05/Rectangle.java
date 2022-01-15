package com.javaex.ex05;

import java.util.Objects;

public class Rectangle {

	private int x;
	private int y;

	public Rectangle() {
	}
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r=(Rectangle) obj;
		if(this.x * this.y == r.y * r.x) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
