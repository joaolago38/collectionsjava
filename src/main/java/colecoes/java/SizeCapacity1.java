package colecoes.java;

import java.util.ArrayList;

public class SizeCapacity1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> al = new ArrayList<Integer>(10);
        al.add(8,12);
        System.out.println("The size of the array is: " + al.size());
    }
}