package com.liulin.study.factory.factory.impl;

import com.liulin.study.factory.factory.Factory;
import com.liulin.study.vo.shape.Circle;
import com.liulin.study.vo.shape.Rectangle;
import com.liulin.study.vo.shape.Shape;
import com.liulin.study.vo.shape.Square;

public class FactoryImpl implements Factory {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Factory factory = new FactoryImpl();
		factory.getShape(Rectangle.class).draw();
		factory.getShape(Square.class).draw();
		factory.getShape(Circle.class).draw();
	}

	public Shape getShape(Class<? extends Shape> c) throws InstantiationException, IllegalAccessException {
		if (c == null) {
			return null;
		}
		return c.newInstance();
	}
}