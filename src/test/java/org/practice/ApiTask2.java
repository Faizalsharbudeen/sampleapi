package org.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiTask2{
	public static void main(String[] args) throws IOException, ParseException  {


		FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\ApiTask2.json");

		JSONParser jsonparser = new JSONParser();

		Object parse = jsonparser.parse(file);
		JSONObject jsonObject = (JSONObject)parse;

		Object object = jsonObject.get("page");
		long page = (Long)object;
		System.out.println(page);


		Object object1 = jsonObject.get("per_page");
		long per_page = (Long)object1;
		System.out.println(per_page);

		Object object2 = jsonObject.get("total");
		long total = (Long)object1;
		System.out.println(total);


		Object object3= jsonObject.get("total_pages");
		long total_pages = (Long)object2;
		System.out.println(total_pages);


		Object dataObject = jsonObject.get("data");
		JSONArray  array = (JSONArray)dataObject;

		for (int i = 0; i < array.size(); i++) {

			Object objects  = array.get(i);

			JSONObject jsonObject2 = (JSONObject)objects;
			Object object4 = jsonObject2.get("id");
			System.out.println(object4);


			JSONObject jsonObject3 = (JSONObject)objects;
			Object object5 = jsonObject3.get("email");
			System.out.println(object5);
			
			JSONObject jsonObject4 = (JSONObject)objects;
			Object object6 = jsonObject4.get("first_name");
			System.out.println(object6);

			JSONObject jsonObject5 = (JSONObject)objects;
			Object object7= jsonObject5.get("last_name");
			System.out.println(object7);
			
			JSONObject jsonObject6 = (JSONObject)objects;
			Object object8 = jsonObject6.get("avatar");
			System.out.println(object8);
		
	
		}
		Object object9 = jsonObject.get("support");
		 JSONObject json = (JSONObject)object9 ;
		  Object url = json.get("url");
		    String U =(String) url;
		    System.out.println(U);
			    
		    Object text = json.get("text");
		    String t =(String) text;
		    System.out.println(t);
		    System.out.println(t);
		    System.out.println(t);
		    System.out.println(t);
		
	}	

}
