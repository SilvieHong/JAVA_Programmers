import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = array[0];
        int l = array.length;
        Arrays.sort(array);
        
        if(l == 3){
            answer = array[1];
        }else{
            answer = array[l / 2];
        }
        return answer;
    }
}
