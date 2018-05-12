package com.liulin.study.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger() {
		this.level = AbstractLogger.ERROR;
	}

	@Override
	protected void write(String message) {
		System.out.println("ErrorLogger::write:" + message);
	}
}
