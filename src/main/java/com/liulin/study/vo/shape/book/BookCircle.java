package com.liulin.study.vo.shape.book;

public class BookCircle implements BookShape {
	@Override
	public void draw() {
		System.out.println("Inside BookCircle::draw() method.");
	}
}