package com.liulin.study.chainofresponsibility;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	// 责任链中的下一个元素
	protected AbstractLogger nextLogger;

	public void logMessage(int level, String message) {
		// 判断是否有权限处理,有权限处理则直接处理.
		if (this.level <= level) {
			write(message);
			return;
		}
		// 没权限处理则给自己的上一级去处理
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}


	abstract protected void write(String message);

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

}