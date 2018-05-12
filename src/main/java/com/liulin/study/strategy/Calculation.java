package com.liulin.study.strategy;

public class Calculation {

	private Algorithm algorithm;

	public Calculation(Algorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}

    public void execute(){  
    	System.out.println("开始计算:");
    	algorithm.Calculation();  
    }  
}
