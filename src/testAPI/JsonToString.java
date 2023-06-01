package testAPI;

import data.Body;
import io.restassured.path.json.JsonPath;

public class JsonToString {

	public static void main(String[] args) 
	{
		JsonPath js = new JsonPath(Body.ApiBody2());
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//printing purchase amount
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		int totalAmount=0;
		System.out.println(purchaseAmount);
		
		//Printing the title of first course
		for (int i = 0; i < count; i++)
		{
			String title = js.get("courses["+i+"].title");
			System.out.println(title);	
			int amount = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].price");
			int price= amount*copies;
			totalAmount = totalAmount+price;		
		}		System.out.println(totalAmount);
		

	}

}
