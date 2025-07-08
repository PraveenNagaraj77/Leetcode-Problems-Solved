package LinearSearch;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Find3DigitEvenNumbers {
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        int[] result = findEvenNumbers(digits);
        System.out.println(Arrays.toString(result));
    }

  public static int[] findEvenNumbers(int[] digits){
      Set<Integer> result = new TreeSet<>();

      int n = digits.length;


      for (int i = 0; i < n; i++) {
          if(digits[i] == 0) continue;

          for (int j = 0; j < n; j++) {
              if(j==i) continue;

              for (int k = 0; k < n; k++) {
                  if(k==i || k==j ) continue;

                  int num =  digits[i]* 100 + digits[j] *10 + digits[k];
                  if(num%2 ==0){
                      result.add(num);
                  }

              }
          }
      }
      int[] ans = new int[result.size()];
      int idx = 0;
      for (int num : result){
          ans[idx++] = num;
      }
      return ans;
  }


}
