package com.liulin.study.template;

public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Inside Cricket::initialize() method.");
	}

	@Override
	void startPlay() {
		System.out.println("Inside Cricket::startPlay() method.");
	}

	@Override
	void endPlay() {
		System.out.println("Inside Cricket::endPlay() method.");
	}

}
