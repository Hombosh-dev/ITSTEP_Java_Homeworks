package Homework_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String path_to_file = sc.nextLine();

    List<String> all_lines = Files.readAllLines(Path.of(path_to_file));

    int index = 0;
    int max_size = 0;
    for(int i = 0; i < all_lines.size(); i++){
      String line = all_lines.get(i);
      if (line.length() > max_size){
        max_size = line.length();
        index = i;
      }
    }

    System.out.println(index + ": " + all_lines.get(index));
  }
}
