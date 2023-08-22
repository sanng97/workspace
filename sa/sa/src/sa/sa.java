package sa;

import java.util.Scanner;

public class sa {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[] arr = new int[3]; // 0,1,2
      
      for(int i=0 ; i<arr.length ;i++) {
         System.out.print("입력 : ");
         arr[i] = sc.nextInt();
      }
      
      // arr[0] = 10 
      // arr[1] = 50 
      // arr[2] = 20
      
      int sum = 0; // 10 + 50 + 20
      
      boolean flag = false; // 신호
      
      for(int i=0 ; i<arr.length ; i++) { // i = 0 1 2
         System.out.println(i + "번째 인덱스에 저장된 값 : " + arr[i]);
         
         if(arr[i] == 0) {
            flag = true;
            break;
         }
         
         sum += arr[i];
      }
      
      if(flag) { // flag 가 true인 경우
         System.out.println("0이 있어서 종료");
      }else {
         System.out.println("sum : " + sum);
      }
      
   }
}