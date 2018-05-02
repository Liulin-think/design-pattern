package com.liulin.study.factory.abstractfactory.impl;

import com.liulin.study.factory.abstractfactory.AbstractFactory;
import com.liulin.study.vo.color.Blue;
import com.liulin.study.vo.color.Color;
import com.liulin.study.vo.color.Green;
import com.liulin.study.vo.color.Red;
import com.liulin.study.vo.shape.Circle;
import com.liulin.study.vo.shape.Rectangle;
import com.liulin.study.vo.shape.Shape;
import com.liulin.study.vo.shape.Square;

public class AbstractFactoryImpl implements AbstractFactory {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		AbstractFactory abstractFactory = new AbstractFactoryImpl();
		abstractFactory.getColor(Red.class).fill();
		abstractFactory.getColor(Green.class).fill();
		abstractFactory.getColor(Blue.class).fill();
		abstractFactory.getShape(Rectangle.class).draw();
		abstractFactory.getShape(Square.class).draw();
		abstractFactory.getShape(Circle.class).draw();
	}
	@Override
	public Color getColor(Class<? extends Color> color) throws InstantiationException, IllegalAccessException {
		return color.newInstance();
	}

	@Override
	public Shape getShape(Class<? extends Shape> shape) throws InstantiationException, IllegalAccessException {
		return shape.newInstance();
	}
}

