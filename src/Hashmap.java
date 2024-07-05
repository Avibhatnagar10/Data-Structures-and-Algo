import java.util.HashMap;
import java.util.Map;


public class Hashmap {
    public static void main(String[] args) {
   HashMap<String,Integer> map = new HashMap<>();
    map.put("India",234);
    map.put("China",901);
    map.put("Europe",200);
    map.put("Russia",345);

    //getting size of map
        int size = map.size();
        System.out.println("Size of map is :" + size);

//        System.out.println(map);
//        System.out.println(map.containsKey("India"));
//        System.out.println(map.get("Europe"));

        map.replace("India",100);  //updating the value
        map.remove("China");

   System.out.println(map );

        int arr[] = {12,26,32,11,51};
//        for(int i=0; i<5;i++ ){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
        for(int val: arr){
            System.out.print(val +" ");
        }
        System.out.println();


        //enhanced for-loop  (designed to iterate over collections and arrays in a more readable and concise manner)
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

//        Set<String> keys = map.keySet();
//        for(String key: keys){
//            System.out.println(key + " " + map.get(key));
//        }
    }



}
