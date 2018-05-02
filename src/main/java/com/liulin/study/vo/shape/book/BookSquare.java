package com.liulin.study.vo.shape.book;

public class BookSquare implements BookShape {
	@Override
	public void draw() {
		System.out.println("Inside BookSquare::draw() method.");
	}
}