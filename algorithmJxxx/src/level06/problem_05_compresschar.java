package level06;

import java.util.Scanner;

public class problem_05_compresschar{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String x = sc.next()+"*";
      
      char comp = x.charAt(0);
      int same = 0;
      for (int i = 0; i < x.length(); i++) {
        char y = x.charAt(i);
        if (comp != y) {
          if (same == 1) {
            System.out.printf("%c", comp);
          } else {
            System.out.printf("%d%c",same, comp);
          }
          comp = y;
          same = 1;
        } else {
          same++;
        }
      }
    }
}
