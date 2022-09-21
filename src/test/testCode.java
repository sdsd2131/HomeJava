package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testCode {
	public static void main(String[] args) {
		System.out.println("Github Test...!!");
		
		System.out.println("Github Test2..!!");
		
		System.out.println("HiHello??");
		
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Yeri");
		map.put("age", "28");
		list.add(map);
		
		map.put("name", "Jongeun");
		map.put("age", "29");
		list.add(map);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("list.get(" + i + ") = " + list.get(i).get("name"));
			System.out.println("list.get(" + i + ") = " + list.get(i).get("age"));
		}
		
		String testName = "()1234()박종은()12341234()";
	}
}
