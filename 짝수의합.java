class Solution {
    int answer = 0;
    public int solution(int n) {
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                answer += i;
            }
        }
     
        return answer;
    }
}
