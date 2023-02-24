import java.util.*;
public class sentence{
public static void WordFrequencies(String str) {
   HashMap<String, Integer> c = new HashMap<>();
    String[] s = str.split("\\s+");
    for (String w : s) {
        if (c.containsKey(w)) {
            c.put(w, c.get(w) + 1);
        } else {
            c.put(w, 1);
        }
    }
    for (String w : c.keySet()) {
        c.put(w,c.get(w));
    }
    System.out.println(c);
}
public static void main(String[]args)
{String str="hii hello hiii how are you you";
   WordFrequencies(str);
}
}