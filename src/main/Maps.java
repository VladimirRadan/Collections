package main;

import java.util.HashMap;
import java.util.Map;

public class Maps {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap();
        map.put(1, "Text 1");
        map.put(2, "Text 2");
        map.put(3, "Text 3");
        map.put(4, "Text 4");
        map.put(55, "Text 55");
        map.put(55, "Text 55");


        for (Map.Entry m : map.entrySet()) {
            System.out.println("key: " + m.getKey() + " Value: " + m.getValue());
        }



        Map<Integer, Boolean> map2 = new HashMap();
        map2.put(1, true);
        map2.put(2, true);
        map2.put(3, false);
        map2.put(4, false);
        map2.put(55, true);




    }





}
