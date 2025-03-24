package SubsetSequenceString;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);

        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = subset(p,s);
        for (ArrayList<Integer> i : res){
            System.out.println(i);
        }
    }

    public static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> p,ArrayList<Integer> s){
        if(s.isEmpty()){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int num = s.remove(0);
        ArrayList<ArrayList<Integer>> left = subset(new ArrayList<>(p),new ArrayList<>(s));
        p.add(num);
        ArrayList<ArrayList<Integer>> right = subset(new ArrayList<>(p),new ArrayList<>(s));
        left.addAll(right);
        return left;
    }
}
