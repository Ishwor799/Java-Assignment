package Array;

import java.util.HashMap;

public class OutputHashMapList {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"Java");
        hashMap.put(2,"Program");
        hashMap.put(3,"Language");

                for(String i:hashMap.values()){
                    System.out.println(i);
                }

hashMap.remove("Program");

    }
}
