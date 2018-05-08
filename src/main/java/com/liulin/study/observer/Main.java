package com.liulin.study.observer;

public class Main {
	public static void main(String[] args) {
		WechatServer server = new WechatServer();

		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		Observer userWang = new User("WangWu");

		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInfomation("推送的第一条消息！");

		System.out.println("----------------------------------------------");
		server.removeObserver(userZhang);
		server.setInfomation("推送的第二条消息！");

	}
}
