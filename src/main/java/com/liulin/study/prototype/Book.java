package com.liulin.study.prototype;

import java.util.ArrayList;

public class Book implements Cloneable{
	private ArrayList<String> list;

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	@Override
	protected Book clone() throws CloneNotSupportedException {
		Book clone = (Book) super.clone();
		// 执行 list.clone 深拷贝,不执行list.clone浅拷贝
//		clone.list=(ArrayList<String>) this.list.clone();
		return clone;
	}
	
	
}
