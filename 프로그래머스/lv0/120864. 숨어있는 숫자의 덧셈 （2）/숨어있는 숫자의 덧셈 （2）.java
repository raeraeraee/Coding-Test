class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] stringArray = my_string.split("[a-zA-Z]");
        
        for (String value : stringArray) {
            answer += value.isEmpty() ? 0 : Integer.parseInt(value);
        }
        return answer;
    }
}