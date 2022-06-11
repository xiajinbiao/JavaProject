package com.harbeu.sparsearray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    public static void main(String[] args) {
        int[][] chessArr1 = new int[11][11];
        // 0表示没有棋子  1表示黑色棋子  2表示蓝色棋子
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("原始的二维数组");
        for (int[] row : chessArr1) {
            for (int col : row) {
                System.out.printf("%d\t", col);
            }
            System.out.println("\n");
        }

        int totalNum = 0;
        for (int[] row : chessArr1) {
            for (int data : row) {
                if (data != 0) {
                    totalNum ++;
                }
            }
        }
        System.out.println("有意义的值的个数为：" + totalNum);
        System.out.println("原始的二维矩阵大小为：" + "行：" + chessArr1.length + "," + "列：" + chessArr1[0].length);

        int[][] sparseArray = new int[totalNum + 1][3];
        sparseArray[0][0] = chessArr1.length;
        sparseArray[0][1] = chessArr1[0].length;
        sparseArray[0][2] = totalNum;

        int index = 1;
        for (int row = 0; row < chessArr1.length; row ++) {
            for (int col = 0; col < chessArr1[row].length; col ++) {
                if (chessArr1[row][col] != 0) {
                    sparseArray[index][0] = row;
                    sparseArray[index][1] = col;
                    sparseArray[index][2] = chessArr1[row][col];
                    index ++;
                }
            }
        }

        System.out.println("写入前的稀疏数组");
        for (int[] row : sparseArray) {
            for (int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

        FileWriter writeFile = null;

        try {
            File file = new File("D:\\JavaProject\\iodata\\sparsearray.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            writeFile = new FileWriter(file);
            for (int row = 0; row < sparseArray.length; row ++) {
                for (int col = 0; col < sparseArray[row].length -1; col ++){
                    writeFile.write(sparseArray[row][col] + ",");
                }
                writeFile.write(sparseArray[row][sparseArray[row].length - 1] + "");
                writeFile.write("\n");
            }
            writeFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writeFile != null) {
                try {
                    writeFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        FileReader reader = null;
        BufferedReader readerbuf = null;
        int[][] arr = null;

        try {
            reader = new FileReader("D:\\JavaProject\\iodata\\sparsearray.txt");
            readerbuf = new BufferedReader(reader);

            List<String> strList = new ArrayList<>();
            String lineStr = null;
            while ((lineStr = readerbuf.readLine()) != null) {
                strList.add(lineStr);
            }

            int lineNum = strList.size();
            String s = strList.get(0);
            int columnNum = s.split("\\,").length;
            arr = new int[lineNum][columnNum];

            int count = 0;
            for (String str : strList) {
                String[] strs = str.split("\\,");
                for (int i = 0; i < columnNum; i ++ ) {
                    arr[count][i] = Integer.parseInt(strs[i]);
                }
                count ++;
            }

            System.out.println("读取后的稀疏数组");
            for (int[] row : arr){
                for (int item : row) {
                    System.out.printf("%d\t", item);
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (readerbuf != null) {
                try {
                    readerbuf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        System.out.println("还原原始数组");
        int[][] chessArray = new int[arr[0][0]][arr[0][1]];

        for (int row = 1; row < arr.length; row ++) {
            chessArray[arr[row][0]][arr[row][1]] = arr[row][2];
        }

        for (int[] row : chessArray) {
            for (int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println("\n");
        }

    }
}