package level03;

import java.util.Scanner;
import java.util.Arrays;

public class problem_12_repnum{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int[] arr = new int[10];
      
      int sum = 0;
      for (int i = 0; i < 10; i++) {
        arr[i] = sc.nextInt();
        sum += arr[i];
      }
      
      int avg = sum/10;
      
      Arrays.sort(arr);
      
      int num = 0;
      int cnt = 0;
      for (int i = 0; i < 10; i++) {
        int comp = arr[i];
        int count = 0;
        for (int j = 0; j < 10; j++) {
          if (comp == arr[j]) {
            count++;
          }
        }
        if (count > cnt) {
          num = comp;
          cnt = count;
        }
      }
      
      System.out.printf("%d\n%d", avg, num);
      
    }
}