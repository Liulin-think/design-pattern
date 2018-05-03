package com.liulin.study.mediator;

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, User touser, String message) {
		System.out.println(new Date() + " [" + user.getName() + "] 对  [" + touser.getName() + "] 说" + message);
	}
}
