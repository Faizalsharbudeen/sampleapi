package org.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Data.json");
		JSONParser js= new JSONParser();
		Object parse = js.parse(f);
		JSONObject object1 = (JSONObject)parse;
		Object object = object1.get("data");
		
		JSONObject object2=(JSONObject)object;
		Object objId = object2.get("id");
		long id=(Long) objId;
		System.out.println(id);
		
		
		Object objMail = object2.get("email");
		String mail=(String) objMail;
		System.out.println(mail);
		
		
	    Object objFirstName = object2.get("first_name");
	    String FirstName=(String) objFirstName;
	    System.out.println(FirstName);
	    
	    Object objLastName = object2.get("last_name");
	    String LastName=(String) objLastName;
	    System.out.println(LastName);
	    
	    Object objAv = object2.get("avatar");
	    String Av=(String) objAv;
	    System.out.println(Av);
	    
	    
	    
	    Object obj1 = object1.get("support");
	    JSONObject json = (JSONObject) obj1;
	    Object url = json.get("url");
	    String U =(String) url;
	    System.out.println(U);
	    
	    
	    Object text = json.get("text");
	    String t =(String) text;
	    System.out.println(t);
	    
	    
	    

	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
