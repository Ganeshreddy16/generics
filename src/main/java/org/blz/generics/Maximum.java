package org.blz.generics;

public class Maximum <E extends  Comparable> {
    E Value1;
    E Value2;
    E Value3;
    Maximum(E Value1,E Value2,E Value3){
        this.Value1=Value1;
        this.Value2=Value2;
        this.Value3=Value3;
    }
    public E getMaximum(){
       E result= getMaximum(Value1,Value2,Value3);
       return  result;


    }
//    public static void main(String[] args) {
//        Integer a = 8, b = 3, c = 4;
//        getMaximum(a, b, c);
//    }

    public static <E extends  Comparable> E getMaximum(E a, E b, E c) {

        E max = a;
        if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        System.out.println(max);
        return max;
    }


}
