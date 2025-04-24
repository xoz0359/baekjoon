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
			
			board[num1][Math.min(board[0].length-1, num2+1)] = 1;
			board[num1][Math.max(0, num2-1)] = 1;
			board[Math.min(board.length-1, num1+1)][num2] = 1;
			board[Math.min(board.length-1, num1+1)][Math.min(board[0].length-1, num2+1)] = 1;
			board[Math.min(board.length-1, num1+1)][Math.max(0, num2-1)] = 1;
			board[Math.max(0, num1-1)][num2] = 1;
			board[Math.max(0, num1-1)][Math.min(board[0].length-1, num2+1)] = 1;
			board[Math.max(0, num1-1)][Math.max(0, num2-1)] = 1;

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