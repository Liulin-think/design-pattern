package com.liulin.study.factory.abstractfactory.impl;

import com.liulin.study.factory.abstractfactory.AbstractFactory;
import com.liulin.study.factory.factory.impl.ColorFactoryImpl;
import com.liulin.study.factory.factory.impl.ShapeFactoryImpl;
import com.liulin.study.vo.color.Color;
import com.liulin.study.vo.color.cup.CupColor;
import com.liulin.study.vo.shape.Shape;
import com.liulin.study.vo.shape.cup.CupShape;

public class CupAbstractFactoryImpl implements AbstractFactory<CupColor, CupShape>{

	@Override
	public Color getColor(Class<? extends CupColor> color) throws InstantiationException, IllegalAccessException {
		return new ColorFactoryImpl().getColor(color);
	}

	@Override
	public Shape getShape(Class<? extends CupShape> shape) throws InstantiationException, IllegalAccessException {
		return new ShapeFactoryImpl().getShape(shape);
	}
	
}