package week11;

import java.util.ArrayList;

public class Task2 {
    public static <S extends Comparable> S max(ArrayList<S> n){
        S max = n.get(0);
        for(int i=0;i<n.size();i++){
            if(max.compareTo(n.get(i))<0){
                max = n.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        ArrayList<Character> a = new ArrayList<Character>();
        a.add(0,'w');
        a.add(1,'i');
        a.add(2,'s');
        System.out.println(max(a)+"\n");
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(0,33);
        b.add(1,-10);
        b.add(2,0);
        System.out.println(max(b)+"\n");
        ArrayList<Byte> c = new ArrayList<Byte>();
        c.add(0, (byte) -18);
        c.add(1,(byte) 50);
        c.add(2,(byte) 17);
        System.out.println(max(c)+"\n");
        ArrayList<Short> d = new ArrayList<Short>();
        d.add(0, (short) -2222);
        d.add(1,(short) 111);
        d.add(2,(short) 2);
        System.out.println(max(d)+"\n");
        ArrayList<Long> e = new ArrayList<Long>();
        e.add(0, (long) 12L);
        e.add(1,(long) -4L);
        e.add(2,(long) 9L);
        System.out.println(max(e)+"\n");
        ArrayList<Float> f = new ArrayList<Float>();
        f.add(0,90.2f);
        f.add(1,3.45f);
        f.add(2,-6.67f);
        System.out.println(max(f)+"\n");
        ArrayList<Double> g = new ArrayList<Double>();
        g.add(0,32.33d);
        g.add(1,1.567d);
        g.add(2,11.4d);
        System.out.println(max(g)+"\n");


    }
}