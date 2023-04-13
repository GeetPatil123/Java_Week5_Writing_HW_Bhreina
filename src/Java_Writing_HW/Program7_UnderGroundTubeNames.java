package Java_Writing_HW;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Program7_UnderGroundTubeNames {
    public void isEmpty() {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_Line");
        tubeNames.add("central_Line");
        tubeNames.add("Circle_Line");
        tubeNames.add("District_Line");
        tubeNames.add("Hammersmith_Line");
        tubeNames.add("Jubilee_Line");
        tubeNames.add("Metropolitan_Line");
        tubeNames.add("Northern_Line");
        tubeNames.add("Piccadilly_Line");
        tubeNames.add("Victoria_Line");
        tubeNames.add("Waterloo_ and_City_Line");

        System.out.println("Given Array List is : " + tubeNames);
        if (tubeNames.isEmpty()) {
            System.out.println("Given ArrayList is Empty!!");
        } else {
            System.out.println("Given Array List is not Empty!!");
        }
    }

    public static void main(String[] args) {
        Program7_UnderGroundTubeNames obj = new Program7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
