package com.liulin.study.observer;

import java.util.Vector;

public class WechatServer implements Observerable {
	private Vector<Observer> observers = new Vector<Observer>();
	// 状态改变时,需要传给观察者的参数
    private String message;

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(item ->{
			item.update(message);
		});
	}
	
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }


}
