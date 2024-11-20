package org.example.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class generate {

    public List<List<Integer>> generate(int numRows) {
        // Create a list to store the result
        List<List<Integer>> result = new ArrayList<>();
        // If numRows is 0, return the empty list
        if (numRows == 0) {
            return result;
        }
        // Add the first row to the result list
        result.add(Collections.singletonList(1));
        // Loop through the remaining rows
        for (int i = 1; i < numRows; i++) {
            // Create a new list to store the current row
            List<Integer> row = new ArrayList<>();
            // Get the previous row from the result list
            List<Integer> preRow = result.get(i - 1);
            // Add the first element of the current row
            row.add(1);
            // Loop through the remaining elements of the current row
            for (int j = 1; j < i; j++) {
                // Add the sum of the previous two elements of the previous row to the current row
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            // Add the last element of the current row
            row.add(1);
            // Add the current row to the result list
            result.add(row);
        }
        // Return the result list
        return result;
    }

    public static void main(String[] args) {
        generate g = new generate();
        System.out.println(g.generate(5));
    }
}
