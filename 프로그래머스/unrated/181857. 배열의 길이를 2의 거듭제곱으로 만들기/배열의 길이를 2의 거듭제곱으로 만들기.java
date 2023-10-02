class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        while (length % 2 == 0) {
            length = length / 2;
        }
        if (length == 1) {
            return arr;
        }
        
        int x = 0;
        int y = 0;
        int len = arr.length;
        
        while (len > x) {
            x = (int) Math.pow(2, y++);
        }
        
        int[] answer = new int[x];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
