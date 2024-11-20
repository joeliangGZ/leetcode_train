package org.example.simple.dp;

import java.util.ArrayList;
import java.util.List;

public class getRow {

    // This method returns a list of integers representing the elements of
    // the rowIndex-th row in Pascal's triangle
    public List<Integer> getRow(int rowIndex) {
        // Create an empty list to store the elements of the row
        List<Integer> res = new ArrayList<>();
        // Loop through the row index
        for (int i = 0; i <= rowIndex; i++) {
            // Add a 1 to the list for each element in the row
            res.add(1);
        }
        // Loop through the row index again
        for (int i = 1; i < rowIndex; i++) {
            // Loop through the elements of the row
            for (int j = i; j > 0; j--) {
                // Set the value of the current element to
                // the sum of the current element and the previous element
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        // Return the list of elements
        return res;
    }

    public static void main(String[] args) {
        getRow obj = new getRow();
        System.out.println(obj.getRow(3));
    }
}