package util;

public class ArrayGenerator {
   public static int[] randomNumbers(int n, int max, int min){
    int[] a = new int[n];

    for (int index = 0; index < a.length; index++) {
        a[index] = (int) (Math.random() * max) + min;
        min = a[index - 1] + 1;
    }
        return a;
   }

   public static int[] randomNumbers2(int n, int max){
    int[] b = new int[n];

    for (int index = 0; index < b.length; index++) {
        b[index] = (int) (Math.random() * max) ;
        for (int j = index; j >= 0; j--) {
            if(b[j] == b[index]){
                index--;
            }
        }
        
    }
        return b;
   }
}
