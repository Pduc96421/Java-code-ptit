package java_code_ptit;

import java.util.*;

public class J08011     {
    public static boolean check(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> a = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if(check(s)){
                if (a.containsKey(s)){
                    a.put(s, a.get(s) + 1);
                }
                else{
                    a.put(s, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> ans = new ArrayList<>(a.entrySet());
        Collections.sort(ans, (x1, x2) -> {
            Integer x = x1.getValue();
            Integer y = x2.getValue();
            return y.compareTo(x);
        });

        for(Map.Entry<String, Integer> x : ans){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
