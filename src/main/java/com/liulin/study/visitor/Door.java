package com.liulin.study.visitor;

import com.liulin.study.vo.color.Color;
import com.liulin.study.vo.shape.Shape;

/**
 * 门
 * @author liulin_think
 *
 */
public class Door {

	private Color color;//这个门的颜色
	
	private Shape shape;//这个门的形状
	
	private People people;//这个门是谁的
	
	
	public Door(Color color, Shape shape, People people) {
		super();
		this.color = color;
		this.shape = shape;
		this.people = people;
	}
	public Door() {
		super();
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	
}
