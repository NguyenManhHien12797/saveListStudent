import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap= new HashMap<>();
        hashMap.put("Hiền ",18);
        hashMap.put("Hiền1 ",19);
        hashMap.put("Hiền2 ",20);
        hashMap.put("Hiền3 ",21);
        System.out.println( hashMap.get("Hiền1"));

        System.out.printf("%s\n%s\n","Display entries in HashMap", hashMap);

        Map<String, Integer> treeMap= new TreeMap<>(hashMap);
        System.out.printf("%s\n%s\n","Display entries in treehMap", treeMap);
        System.out.println("OK"+treeMap.get("Hiền"));

        Map<String, Integer> linkHasMap= new LinkedHashMap<>(5,0.75f,true);
        linkHasMap.put("Hiền",15);
        linkHasMap.put("Hiền1",16);
        linkHasMap.put("Hiền2",17);
        linkHasMap.put("Hiền3",18);
        linkHasMap.put("Hiền4",19);
        linkHasMap.put("Hiền5",20);
        linkHasMap.put("Hiền6",21);

        System.out.println("\n The age for "+ "Hiền is "+ linkHasMap.get("Hiền"));
        System.out.println("\n The age for "+ "Hiền6 is "+ linkHasMap.get("Hiền6"));
        System.out.println(linkHasMap);
    }
}
