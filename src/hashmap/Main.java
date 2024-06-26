package hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // Create a HashMap object called
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//        // Add keys and values (Country, city)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//
//        capitalCities.putIfAbsent("South Africa", "Pretoria");
//
//       for(String i : capitalCities.keySet()){
//           System.out.println("key: " + i + "\nvalue: "+ capitalCities.get(i) + "\n");
//       }


      List<Map<String, String>> mapList = new ArrayList<>();

      Map<String, String> map1 = new HashMap<>();

      map1.put("Key1", "Soccer" );
      map1.put("key2", "Football");

      mapList.add(map1);

        Map<String, String> map2 = new HashMap<>();

        map2.put("Key3", "netball" );
        map2.put("key4", "rugby");

        mapList.add(map2);

        for (Map<String, String> map : mapList){

            for(Map.Entry<String, String> entry : map.entrySet()){
                System.out.println(entry.getKey() +" : "+ entry.getValue());
            }

        }


    }
    }

