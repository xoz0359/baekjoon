import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
    /*
    인자로 정사각형 돗자리의 한 변을 의미하는 int형 배열 mats와
    다른 돗자리가 설치된 공원을 의미하는 2차원 배열 park가 주어질 때,
    공원에 깔 수 있는 가장 넓은 돗자리의 한 변 길이를 return하는 함수를 작성해야 한다

    필요한 모듈
    1. 낮은 좌표한 점이 주어질 때 인자로 주어진 돗자리들을 설치 가능한지 판단하는 모듈
    2. 1에 park에서 비어 있는 좌표를 순차적으로 전달하는 모듈
     */
        Arrays.sort(mats);

        int meaningfulMatSize = -1;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (park[i][j].equals("-1")) {
                    // todo 비어있는 좌표 i, j와 mats가 인자로 주어질 때 설치가능한지 판단하는 모듈 구현
                    meaningfulMatSize = Math.max(meaningfulMatSize, inspectMat(mats, park, i, j));

                }
            }
        }
        return meaningfulMatSize;
    }

        public int inspectMat(int[] mats, String[][] park, int y, int x) {
        int matSize = -1;
        for (int i = mats.length - 1; i >= 0; i--) {
            boolean isMeaningfulMat = true;

            for (int j = 0; j < mats[i]; j++) {
                if (isMeaningfulMat) {
                    for (int k = 0; k < mats[i]; k++) {
                        if (y + j >= park.length || x + k >= park[j].length) {
                            isMeaningfulMat = false;
                            break;
                        }
                        if (!park[y + j][x + k].equals("-1")) {
                            isMeaningfulMat = false;
                        }
                    }
                }
            }

            if (isMeaningfulMat) {
                matSize = mats[i];
                return matSize;
            }
        }
        return matSize;
    }
}