package com.liulin.study.vo.color.book;

public class BookRed implements BookColor {
	@Override
	public void fill() {
		System.out.println("Inside BookRed::fill() method.");
	}
}