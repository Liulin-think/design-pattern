package com.liulin.study.visitor;

/**
 * 装修者
 * @author liulin_think
 *
 */
public class Decorator extends People implements DoorOperation{

	public Decorator(String name) {
		super(name);
	}

	@Override
	public void open(Door door) {
		System.out.print(this.getName()+"是装修者,");
		System.out.println("开"+door.getPeople().getName()+"家的门用临时钥匙开门.");
	}

	
}
