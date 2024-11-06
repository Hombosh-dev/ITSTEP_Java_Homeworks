package Homework_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Ex4 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String path_to_file = "/Users/olehhombosh/Desktop/3.txt";
    String str_array = sc.nextLine();
    int[] arr = Arrays.stream((str_array.split(" "))).mapToInt(Integer::parseInt).toArray();
    str_array += "\n\r";
    str_array += Arrays.toString(Arrays.stream(arr).filter(x -> x % 2 == 0).toArray());
    str_array += "\n\r";
    str_array += Arrays.toString(Arrays.stream(arr).filter(x -> x % 2 != 0).toArray());
    str_array += "\n\r";
    Collections.reverse(Arrays.asList(arr));
    str_array += Arrays.toString(Arrays.stream(arr).toArray());
    Path file = Path.of(path_to_file);
    Files.writeString(file, str_array);
  }
}
