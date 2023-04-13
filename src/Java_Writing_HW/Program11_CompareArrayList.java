package Java_Writing_HW;

import java.util.ArrayList;

public class Program11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //sorting the comparison output in ArrayList<string>
        ArrayList<String> c3 = new ArrayList<>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}
