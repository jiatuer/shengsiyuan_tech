package com.shengsiyuan.lesson6;

import java.util.HashMap;

public class MapTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Comparable, String> map = new HashMap<Comparable, String>();
		map.put("a","zhangsan");
		map.put("b","lisi");
		map.put("c","wangwu");
		map.put("c","liudehua");
		map.put(1,"s");
		
		System.out.println(map);
		//��key���value
		System.out.println(map.get(1));
		//��key����null 
		System.out.println(map.get(3));
		//���map��key��Ϣ
		System.out.println(map.keySet());
	}

}
