import java.util.ArrayList;

class Solution {
    public int solution(int[][] board) {
		// 초기 board에서 폭탄이 존재하는 칸을 스트링으로 저장
        ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 1) {
					list.add(i+","+j);
				}
			}
		}
		
		// 폭탄의 위험지대를 모두 1로 변경
		for (int i = 0; i < list.size(); i++) {
			String numArr[] = list.get(i).split(",");
			int num1 = Integer.parseInt(numArr[0]);
			int num2 = Integer.parseInt(numArr[1]);
            int num1Start = Math.max(0, num1-1);
			int num1And = Math.min(board.length-1, num1+1);
			int num2Start = Math.max(0, num2-1);
			int num2And = Math.min(board[0].length-1, num2+1);
			int temp = num2Start;
			
			while(num1Start <= num1And) {
				num2Start = temp;
				while(num2Start <= num2And) {
					board[num1Start][num2Start] = 1;
					num2Start++;
				}
				num1Start++;
			}

		}
		
		// 안전지대만 합산
		int cnt = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0) {
					cnt++;
				}
			}
		}
		return cnt;
    }
}