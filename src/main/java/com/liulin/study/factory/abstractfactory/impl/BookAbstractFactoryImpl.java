package com.liulin.study.factory.abstractfactory.impl;

import com.liulin.study.factory.abstractfactory.AbstractFactory;
import com.liulin.study.factory.factory.impl.ColorFactoryImpl;
import com.liulin.study.factory.factory.impl.ShapeFactoryImpl;
import com.liulin.study.vo.color.Color;
import com.liulin.study.vo.color.book.BookColor;
import com.liulin.study.vo.shape.Shape;
import com.liulin.study.vo.shape.book.BookShape;

public class BookAbstractFactoryImpl implements AbstractFactory<BookColor, BookShape> {

	@Override
	public Color getColor(Class<? extends BookColor> color) throws InstantiationException, IllegalAccessException {
		return new ColorFactoryImpl().getColor(color);
	}

	@Override
	public Shape getShape(Class<? extends BookShape> shape) throws InstantiationException, IllegalAccessException {
		return new ShapeFactoryImpl().getShape(shape);
	}
}

