class Solution {
    public int solution(int[] common) {
        
        boolean a = true;
        
        // 등차수열 검사
        
        for (int i = 0; i < common.length-2; i++){
            if ((common[i+1]-common[i])+common[i+1]!=common[i+2]){
                a = false;
                break;
            }
        } 
        // 수열이 작아지는 경우는 고려를 안 했음
        // -1 -2 -3 -4
        // -3 9 -18
        
        // 등차면
        if(a) {
            int num = common[1]-common[0];
           return (num)+common[common.length-1];
        }
        // 등비면
        int num = common[0] == 0 ? common[common.length-1]/common[common.length-2] : common[1]/common[0] ;
        return (num)*common[common.length-1];
    }
}