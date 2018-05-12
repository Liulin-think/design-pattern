package com.liulin.study.strategy;

/**
 * 消耗小模式 
 * @author liulin_think
 *
 */
public class Small implements Algorithm {

	@Override
	public void Calculation() {
		System.out.println("我是消耗最小的");
	}

}
