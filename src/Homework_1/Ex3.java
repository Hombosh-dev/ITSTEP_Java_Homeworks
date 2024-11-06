package Homework_1;

//Необхідно завантажити дані із файлу в різні масиви, вивести кожен масив на екран, показати максимум і
//мінімум в кожному масиві, суму елементів кожного масиву, а також загальну суму всіх масивів.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String path_to_file = sc.nextLine();

    List<String> all_lines = Files.readAllLines(Path.of(path_to_file));
    System.out.println("Array 1:");
    int[] arr_1 = Arrays.stream((all_lines.get(0).split(" "))).mapToInt(Integer::parseInt).toArray();
    System.out.println("Array 2:");
    int[] arr_2 = Arrays.stream((all_lines.get(1).split(" "))).mapToInt(Integer::parseInt).toArray();
    System.out.println(Arrays.toString(arr_1));
    System.out.println(Arrays.toString(arr_2));
    System.out.println("Arr 1 info (max/min/sum):");
    System.out.println(Arrays.stream(arr_1).max().getAsInt());
    System.out.println(Arrays.stream(arr_1).min().getAsInt());
    System.out.println(Arrays.stream(arr_1).sum());
    System.out.println("Arr 2 info (max/min/sum):");
    System.out.println(Arrays.stream(arr_2).max().getAsInt());
    System.out.println(Arrays.stream(arr_2).min().getAsInt());
    System.out.println(Arrays.stream(arr_2).sum());
    System.out.println("Sum of 2 arrays:");
    System.out.println(Arrays.stream(arr_1).sum() + Arrays.stream(arr_2).sum());
  }
}
