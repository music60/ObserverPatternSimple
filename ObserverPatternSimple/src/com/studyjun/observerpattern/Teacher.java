package com.studyjun.observerpattern;


/**
 * 
 * 老师
 * @author studyjun
 *
 */
public class Teacher extends Subject {

	/**
	 * 提醒收卷
	 */
	@Override
	public void notifyObserver() {
		System.out.println("答题结束，请同学上交试卷");
		super.notifyObserver();
		System.out.println("答题结束，收卷完毕");
	}
}
