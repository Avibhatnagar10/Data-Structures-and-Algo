package Hashing;
import java.util.HashMap;
public class Hashing {
    public static void main(String[] args){
        //Country(key),Population(value)
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India",120);
        map.put("China",150);
        map.put("Europe",20);
        System.out.println(map);

        //Searching
        if(map.containsKey("China")){
            System.out.println("Key is present in map");
        }else{
            System.out.println("Key is not present");
        }

        //removing key
        map.remove("China");

        //Getting size of map
        int size = map.size();
        System.out.println("The size of map is :" + size);


        //searching hashmap
        System.out.println(map.get("China"));   //key exist  //use to access the value
        System.out.println(map.get("London"));
        System.out.println(map.containsKey("India"));

        //Iteration in HashMap
        int arr[] = {12,23,34,42,55};
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

    }
}
