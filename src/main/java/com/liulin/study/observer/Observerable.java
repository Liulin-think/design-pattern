package com.liulin.study.observer;

/***
 * 抽象被观察者接口
 * 
 * @author jstao
 *
 */
public interface Observerable {
	/**
	 * 添加观察者
	 * @param o
	 */
	public void registerObserver(Observer o);

	/**
	 * 删除观察者
	 * @param o
	 */
	public void removeObserver(Observer o);

	/**
	 * 通知观察者
	 */
	public void notifyObserver();

}