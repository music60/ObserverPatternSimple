package com.studyjun.observerpattern;

import java.util.ArrayList;
import java.util.List;


/**
 * 主题
 * @author studyjun
 *
 */
public abstract class Subject {

	List<Observable> observers = new ArrayList<Observable>(); //观察者列表

	/**
	 * 更新观察者
	 */
	public void notifyObserver(){
		for (Observable observer : observers) {
			observer.update();
			
		}
	}
	
	
	/**
	 * 添加观察者
	 * @param observerable
	 */
	public void addObserver(Observable observable){
		observers.add(observable);
	}
	
	/**
	 * 移除观察者
	 */
	public void removeObserver(Observable observable){
		observers.remove(observable);
	}
}
