package com.liulin.study.chainofresponsibility;

public class FileLogger extends AbstractLogger {

	public FileLogger() {
		this.level = AbstractLogger.DEBUG;
	}

	@Override
	protected void write(String message) {
		System.out.println("FileLogger::write:" + message);
	}
}