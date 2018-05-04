package com.liulin.study.singleton;

import com.liulin.study.vo.shape.Circle;
import com.liulin.study.vo.shape.Rectangle;
import com.liulin.study.vo.shape.Shape;
import com.liulin.study.vo.shape.Square;

/**
 * 【单例模式】： 
 * 【枚举】
 * 【JDK 版本】：JDK1.5 起
 * 【是否 Lazy 初始化】：否
 * 【是否多线程安全】：是
 * 【实现难度】：易
 * 【描述】：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 * 不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * 不能通过 reflection attack 来调用私有构造方法。
 * @author liulin_think
 *
 */
public enum Singleton3 {

	矩形("0", new Rectangle()), 
	圆形("1", new Circle()), 
	正方形("2", new Square());

	private String id;
	private Shape shape;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	Singleton3(String id, Shape shape) {
		this.id=id;
		this.shape=shape;
	}

	public static Singleton3 getCateroy(String id) {
		for (Singleton3 item : Singleton3.values()) {
			if(item.getId().equals(id)) {
				return item;
			}
		}
		return null;
	}

}
