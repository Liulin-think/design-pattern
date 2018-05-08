package com.liulin.study.visitor;

/**
 * 
 * @author liulin_think
 *
 */
public class Master extends People implements DoorOperation{

	public Master(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open(Door door) {
		System.out.print(this.getName()+"是主人,");
		System.out.println("开"+door.getPeople().getName()+"家的门用正式钥匙开门.");
	}

}
