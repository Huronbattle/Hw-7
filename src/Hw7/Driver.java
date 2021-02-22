package Hw7;


import java.net.URL;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Scanner;

public class Driver 
{

	
	public static void main(String[] args)
	{ 
		URLReader hearthstoneURLReader = new URLReader("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		
		Object obj = JSONValue.parse(hearthstoneURLReader.getTheURLContents());
		HearthstoneCard[] theMinions = new HearthstoneCard[1924];
		
		
	    
	    if(obj instanceof JSONArray)
	    {
	    	
	    	
	    	JSONArray array = (JSONArray)obj;
	    	int count = 0;
	    	
		    for(int i = 0; i < array.size(); i++)
		    {
		    	JSONObject cardData = (JSONObject)array.get(i);
		    	if(cardData.containsKey("cost") && cardData.containsKey("name"))
		    	{
		    		if(cardData.containsKey("type") && cardData.get("type").equals("MINION"))
		    		{
		    			//.display()?
		    			System.out.format("Name: %s \nCost: %d \nAttack: %d Defense: %d\n", cardData.get("name"), cardData.get("cost"), cardData.get("attack"),cardData.get("health"));
			    		count++;
		    		}
		    		
		    	}
		    	
		    }
		   
	    }
	    //theMinions.display();
	}
}
