class Solution {

    public int solution(int n, int w, int num) {
    	int onBox = 1;
    	int cnt = num%w == 0 ? num/w : num/w+1;
    	while(true) {
            int rowSum = (w*cnt)*2+1;
            num = rowSum - num;
            if (num > n) return onBox;
            cnt++;
            onBox++;
    	}
    }
}