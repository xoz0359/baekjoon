    import java.util.ArrayList;
    import java.util.List;

class Solution {
     public int[] solution(int[] array, int[][] commands) {
            // array가 주어질 때
            // commands의 요소 a부터 b까지를 잘라서 자른 배열을 오름차순으로 정렬 후
            // k번째 요소를 배열에 담아서 반환하라
            int commandSize = commands.length;
            int indexCnt = 0;
            int[] result = new int[commandSize];
            for (int i = 0; i < result.length; i++) {
                List<Integer> targetArray = new ArrayList<>();
                int num1 = commands[i][0]-1;
                int num2 = commands[i][1]-1;
                int num3 = commands[i][2]-1;

                // 배열 자르기
                while(num1 <= num2){
                    targetArray.add(array[num1]);
                    num1++;
                }

                // 정렬하기
                for (int j = 0; j < targetArray.size(); j++) {
                    for (int k = j+1; k < targetArray.size(); k++) {
                        if(targetArray.get(j) > targetArray.get(k)){
                            int temp = targetArray.get(j);
                            targetArray.set(j, targetArray.get(k));
                            targetArray.set(k, temp);
                        }
                    }
                }
                for (int t = 0; t < targetArray.size(); t++){
                    System.out.println(targetArray.get(t)); 
                }
                result[i] = targetArray.get(num3);

            }
        
            

            return result;
        }

}