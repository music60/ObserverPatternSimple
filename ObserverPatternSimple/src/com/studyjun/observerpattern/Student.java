package com.studyjun.observerpattern;


/**
 * 
 * 学生
 * @author studyjun
 *
 */
public class Student implements Observable {
	
	/**
	 * 持有一个教师引用
	 */
	private Teacher teacher;
	
	public Student(Teacher teacher){
		this.teacher = teacher;
		this.teacher.addObserver(this);
	}
	
	/**
	 * 学生收卷
	 */
	@Override
	public void update() {
		System.out.println("学生"+hashCode()+"收卷");
	}
	
	
}
