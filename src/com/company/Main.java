package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String quantity = reader.readLine();

        int[] list_arr = Arrays.stream(quantity
                .trim()
                .split(" "))
                .filter(x -> !x.equals(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;
        int maximal = list_arr[0];

        int max = 0;
        for (int j = 0; j < n; j++) {
            if (list_arr[j] > max) {
                max = list_arr[j];
            }
        }

        int min = list_arr[0];
        for (int i = 0; i < list_arr.length; i++) {
            if (list_arr[i] < min) {
                min = list_arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            maximal = Math.max(list_arr[i], maximal);
            if (list_arr[i] < maximal) {
                result = -1;
                System.out.println("-1");
                break;
            }
        }
        if (result == 0) {
            System.out.println(max-min);
        }
    }
}

