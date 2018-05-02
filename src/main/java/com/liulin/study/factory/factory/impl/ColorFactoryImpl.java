package com.liulin.study.factory.factory.impl;

import com.liulin.study.factory.factory.ColorFactory;
import com.liulin.study.vo.color.Blue;
import com.liulin.study.vo.color.Color;
import com.liulin.study.vo.color.Green;
import com.liulin.study.vo.color.Red;

public class ColorFactoryImpl implements ColorFactory {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		ColorFactory factory = new ColorFactoryImpl();
		factory.getColor(Blue.class).fill();
		factory.getColor(Green.class).fill();
		factory.getColor(Red.class).fill();
	}

	public Color getColor(Class<? extends Color> c) throws InstantiationException, IllegalAccessException {
		if (c == null) {
			return null;
		}
		return c.newInstance();
	}
}