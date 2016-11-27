package com.qianfeng.gson03;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * [{name:'tom',age:23},{name:'jerry',age:25},{name:'rose',age:25},{name:'jack',age:27}]
 */
public class GSONDemo04 {

	public static void main(String[] args) {
		String str = "[{name:'tom',age:23},{name:'jerry',age:25},{name:'rose',age:25},{name:'jack',age:27}]";
		//返回集合的类型
		Type type = new TypeToken<List<Employees>>(){}.getType();
		
		List<Employees>list = new Gson().fromJson(str,type);
		
		System.out.println(list);
	}
}
