package epam.Task4;

public class GetHouseTypeMaterial {

	public TotalCost getPlan(String housetype)
	{
		if(housetype==null)
			return null;
		if(housetype.equalsIgnoreCase("standard material")) {  
            return new StandardMaterial();  
          }   
      else if(housetype.equalsIgnoreCase("Abovestandard material")){  
           return new AboveStandardMaterial();  
       }   
     else if(housetype.equalsIgnoreCase("Highstandard material")) {  
           return new HIghStandardMaterial();  
     }
     else if(housetype.equalsIgnoreCase("HighstandardFullautomatic")) {  
   	  return new HIghStandardandFullAutomatic();
     }
 return null;  
}  
}
