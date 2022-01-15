package com.javaex.ex04;

import java.util.Objects;

public class Rectangle {

	private int x;
	private int y;

	public Rectangle() {
	}
	
	public Rectangle(int x, int y) {
			this.x=x;
			this.y=y;
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
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;
		if (this.x == r.x && this.y == r.y) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}

}
