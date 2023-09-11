// we want to look for a country effectively without the need to iterate through all the countries

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main{
    public static void main(String[] args){

        //create a HashMap dictionary
        HashMap<String, List<String>> countries = new HashMap<String, List<String>>();

        //create list of countries 
        List<String> G =  new ArrayList<String>(){
            { 
                add("Ghana");
                add("Greenland");                
                add("Greece");  
            }
        };
        List<String> I =  new ArrayList<String>(){
            { 
                add("India");
                add("Ireland");                
                add("Italy");
                add("Iceland");  
  
            }
        };
        List<String> M =  new ArrayList<String>(){
            { 
                add("Morocco");
                add("Maldives");                
                add("Mali");
            }
        };

        //now we initialize the hashmap with those lists :
        countries.put("G", G);
        countries.put("M", M);
        countries.put("I", I);
    }
}