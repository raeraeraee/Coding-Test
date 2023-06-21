import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        int[] answer_arr = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answer_arr[i] = answer.get(i).intValue();
        }
        return answer_arr;
    }
}