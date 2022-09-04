//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Iterator;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//
//public class JsonRead {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//      JSONparser parser = new JSONparser();
//      
//      try {
//    	  
//    	  Object obj = parser.parse(new FileReader(""));
//    	  JSONObject JSONObject =(JSONObject)obj;
//    	  
//    	  String name = (String) JSONObject.get("name");
//    	  System.out.println(name);
//    	  String city = (String) JSONObject.get("city");
//    	  System.out.println(city);
//    	  
//    	  JSONArray cars = (JSONArray) JSONObject.get("city");
//    	  Iterator<String> Iterator = cars.iterator();
//    	  while(Iterator.hasNext()) {
//    		  System.out.println(Iterator.next());
//    	  }
//    	  
//      } catch (FileNotFoundException e) {
//          e.printStackTrace();
//      }
//	}
//
//}
///*
//[  
// {  
//     "name":"John",
//     "city":"Berlin",
//     "cars":[  
//         "audi",
//         "bmw"
//     ],
//     "job":"Teacher"
// },
// {  
//     "name":"Mark",
//     "city":"Oslo",
//     "cars":[  
//         "VW",
//         "Toyata"
//     ],
//     "job":"Doctor"
// }
//]
//
//JSONArray jsonChildArray = (JSONArray) jsonChildArray.get("LanguageLevels");
//    JSONObject secObject = (JSONObject) jsonChildArray.get(1);
//    
//    for
//    
//    
//*/