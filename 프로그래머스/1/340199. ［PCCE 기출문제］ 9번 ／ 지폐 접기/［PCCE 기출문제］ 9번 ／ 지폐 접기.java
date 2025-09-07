class Solution {
   public int solution(int[] wallet, int[] bill) {
        // 주어진 지갑 크기에 맞을 때까지 지폐를 반으로 몇 번 접어야 하는지 구해야 한다
        // 지폐를 반으로 접는 모듈
        // 지폐가 지갑에 들어가는지 확인하는 모듈

        int cnt = 0;

        while(true){
            if (bill[0] <= wallet[0] && bill[1] <= wallet[1]){
                return cnt;
            }else if (bill[1] <= wallet[0] && bill[0] <= wallet[1]){
                return cnt;
            }else {
                bill = resizeBill(bill);
            }
            cnt++;
        }
    }

    public int[] resizeBill(int[] bill) {
        // 지폐는 더 긴 방향으로만 반으로 접힌다
        if (bill[0] >= bill[1]) {
            bill[0] = bill[0]/2;
        }else{
            bill[1] = bill[1]/2;
        }
        return bill;
    }
}