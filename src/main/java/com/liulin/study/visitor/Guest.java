package com.liulin.study.visitor;

/**
 * 客人
 * @author liulin_think
 *
 */
public class Guest extends People implements DoorOperation{

	public Guest(String name) {
		super(name);
	}

	@Override
	public void open(Door door) {
		String name = door.getPeople().getName();
		System.out.print(this.getName()+"是客人,");
		System.out.println("开"+name+"家的门,敲门,请"+name+"帮自己开门.");
	}

}
