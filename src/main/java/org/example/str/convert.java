package org.example.str;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 6.Z字形变换 Middle
 */
public class convert {

    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += (goingDown? 1 : -1);
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : rows) {
            sb.append(row);
        }

        return sb.toString();
    }

    public String convert2(String s, int numRows) {

        List<List<Character>> ds = new ArrayList<>(numRows);

        int i = 0;
        while (i < s.length()) {
            int index = calcWhichListToAdd(i, numRows);
            if (index == 0) {
                for (List<Character> d : ds) {
                    if (i >= s.length()) {
                        break;
                    }
                    d.add(s.charAt(i));
                    i++;
                }
            } else {
                int indexToAdd = numRows - 1 - index;
                for (int i1 = 0; i1 < ds.size(); i1++) {
                    if (i >= s.length()) {
                        break;
                    }
                    if (indexToAdd == i1) {
                        ds.get(indexToAdd).add(s.charAt(i));
                        i++;
                    } else {
                        ds.get(i1).add(null);
                    }
                }

            }
        }

        List<Character> asList = new ArrayList<>();
        for (List<Character> d : ds) {
            asList.addAll(d);
        }

        return asList.stream().filter(Objects::nonNull)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private int calcWhichListToAdd(int i, int numRows) {
        return i % numRows;
    }
}
