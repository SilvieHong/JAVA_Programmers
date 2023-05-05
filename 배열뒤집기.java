class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        if(num_list.length == 1){
            answer[0] = num_list[0];
        }else{
            for(int i = num_list.length-1; i>=0; i--){
                 answer[num_list.length-i-1] = num_list[i];
            }
        }
        return answer;
    }
}
