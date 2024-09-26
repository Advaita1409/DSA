import java.util.*;
import java.util.stream.*;
class Q1{
public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap)
    {
    Map<K, V> treeMap = new TreeMap<>();
    treeMap.putAll(hashMap);
    return treeMap;
    }
public static void main(String args[])
    {
    Map<String, String> hashMap = new HashMap<>();
    hashMap.put("1", "Welcome");
    hashMap.put("2", "to");
    hashMap.put("3", "Coding Class");
    System.out.println("Original HashMap: " + hashMap);
    Map<String, String> treeMap = convertToTreeMap(hashMap);
    System.out.println("TreeMap: " + treeMap);
    }
}