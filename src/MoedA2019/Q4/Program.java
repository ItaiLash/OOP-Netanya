package MoedA2019.Q4;

import java.util.*;

public class Program {

    public static int results (List<String> votes, int hasima){
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (String v : votes){
            String k = v.toLowerCase();
            if (!map.containsKey(k))
                map.put(k, 1);
            else {
                map.put(k, map.get(k) + 1);
            }
        }

        List<String> toRemove = new ArrayList<String>();
        for (String k : map.keySet()){
            if (map.get(k) < hasima) toRemove.add(k);
        }
        System.out.println("Parties that did not pass hasima are:");
        for (String k : toRemove){
            System.out.println(k);
            map.remove(k);
        }

        if (map.size() == 0) return 0;

        int maxVotes = Collections.max(map.values());
        String biggestParty =  null;

        System.out.println("Parties that did pass hasima are:");
        List<String> keys = new ArrayList<String>();
        keys.addAll(map.keySet());
        Collections.sort(keys);
        for (String k : keys){
            System.out.println(k + ":" + map.get(k));
            if (map.get(k) == maxVotes) biggestParty = k;
        }
        System.out.println("Biggest party is : " + biggestParty );
        return map.get(biggestParty);
    }

    public static void main(String[] args) {
        List<String> vots = Arrays.asList("BB","BB","Bb","aA","CCC","aa","cCc","aa","dddd","bb","bb");
        int x = results(vots, 2);
    }

}
