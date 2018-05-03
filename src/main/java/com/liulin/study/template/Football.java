package com.liulin.study.template;

public class Football extends Game {

	@Override
	void initialize() {
		System.out.println("Inside Football::initialize() method.");
	}

	@Override
	void startPlay() {
		System.out.println("Inside Football::startPlay() method.");
	}

	@Override
	void endPlay() {
		System.out.println("Inside Football::endPlay() method.");
	}

}
