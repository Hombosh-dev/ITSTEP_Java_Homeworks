package Homework_1;

import static java.lang.Math.min;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String path_to_first = sc.nextLine();
    String path_to_second = sc.nextLine();

    Path first_file = Path.of(path_to_first);
    Path second_file = Path.of(path_to_second);
    List<String> file1 = Files.readAllLines(first_file);
    List<String> file2 = Files.readAllLines(second_file);

    int min_length = min(file1.size(), file2.size());

    for (int i = 0; i < min_length; i++) {
      if (!file1.get(i).equals(file2.get(i))) {
        System.out.println("Line " + i + ": " + file1.get(i) + " don`t match with " + file2.get(i));
      }
    }
  }
}
