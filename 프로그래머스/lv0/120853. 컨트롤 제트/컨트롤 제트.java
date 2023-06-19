class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] parse = s.split(" ");
		
		for(int i=0; i<parse.length; i++) {
			if(!parse[i].equals("Z")) {
				answer += Integer.parseInt(parse[i]);
			}
			else {
				answer = answer - Integer.parseInt(parse[i-1]);
			}
		}
        return answer;
    }
}