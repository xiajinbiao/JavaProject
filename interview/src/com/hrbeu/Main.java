package com.hrbeu;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null) {
            String[] temp = str.split(" ");
            int row = Integer.valueOf(temp[0]);
            int col = Integer.valueOf(temp[1]);
            String[] temp1 = reader.readLine().split(" ");
            int[] begin = {Integer.valueOf(temp1[0]), Integer.valueOf(temp1[1])};
            String[] temp2 = reader.readLine().split(" ");
            int[] end = {Integer.valueOf(temp2[0]), Integer.valueOf(temp2[1])};
            int count = Integer.valueOf(reader.readLine());
            int[][] arr = new int[count][2];
            for (int i = 0; i < count; i++) {
                String[] items = reader.readLine().split(" ");
                arr[i][0] = Integer.valueOf(items[0]);
                arr[i][1] = Integer.valueOf(items[1]);
            }
            char[][] map = new char[row][col];
            for (int[] ints : arr) {
                map[ints[0]][ints[1]] = 'x';
            }
            int[] ans = bfs(map, begin, end);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }

    public static int[] bfs(char[][] map, int[] begin, int[] end) {

    }
}
