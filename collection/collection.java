/*output-
Map{gender=female, imageUrl="https://www.techrel.com?id=101", href=https://search, branch=ProjectDevelopment, age=22}
gender:female
imageUrl:"https://www.techrel.com?id=101"
href:https://search
branch:ProjectDevelopment
age:22
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Collectionspackage;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author biradar bharat
 */


public class collection {

    public static void dataRepresentation(String input) {
        String data = input;
       String key, value;
//     collection
        Map<String, String> map = new HashMap();
        String[] token1;
        token1 = data.split("\\?");
        String[] href = token1[0].split("=");
        key = href[0];
        value = href[1];
        map.put(key, value);// put method used for data insert

        String[] token2 = token1[1].split("&");
        for (int i = 0; i < 3; i++) {
            String[] href1 = token2[i].split("=");
            
            key = href1[0];
            value = href1[1];
            map.put(key, value);
        }
        // this is the main
        String[] token3 = data.split("&");
        //imageUrl="https://www.techrel.com?id=1001
        String[] href1 = token3[3].split("l=");
        key = href1[0] + "l";
        value = href1[1];
        map.put(key, value);

        System.out.println("Map" + map);
       
       for (String name: map.keySet()) {
            key = name.toString();
            value = map.get(name).toString();
       System.out.println(key + ":" + value);
}
    }

    public static void main(String[] args) {
        String input = "href=https://search?branch=ProjectDevelopment&age=22&gender=female&imageUrl=\"https://www.techrel.com?id=101\"";
        dataRepresentation(input);
    }

}

