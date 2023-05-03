class Solution {
    int sum = 0;
    public double solution(int[] numbers) {
        for(int i=0; i < numbers.length; i++){
            sum += numbers[i];
        }
        
        double answer = (double)sum / numbers.length;
        return answer;
    }
}
