package com.studyjun.observerpattern;

public class Test {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher(); //主题类
		
		Student s1 = new Student(teacher); //添加观察者
		Student s2 = new Student(teacher);
		Student s3 = new Student(teacher);
		Student s4 = new Student(teacher);
		Student s5 = new Student(teacher);
		Student s6 = new Student(teacher);
		
		teacher.notifyObserver(); //提醒观察者
		
		
	}
}
