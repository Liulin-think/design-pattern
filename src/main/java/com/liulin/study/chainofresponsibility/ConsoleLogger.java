package com.liulin.study.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger() {
		this.level = AbstractLogger.INFO;
	}

	@Override
	protected void write(String message) {
		System.out.println("ConsoleLogger::write:" + message);
	}
}