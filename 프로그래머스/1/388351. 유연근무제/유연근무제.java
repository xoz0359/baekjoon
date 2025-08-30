import java.util.stream.IntStream;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
     int giftLength = schedules.length;

        // 주말의 출근 시간을 제거하는 모듈
        for (int i = 0; i < timelogs.length; i++) {

            final int idx = i;
            timelogs[idx] = IntStream.range(0, 7)
                    .filter(j -> (j + startday) % 7 != 0 && (j + startday) % 7  != 6)
                    .map(j -> timelogs[idx][j])
                    .toArray();
        }

        for (int i = 0; i < schedules.length; i++) {
            // 3~4자리 숫자 패턴에서 시, 분 데이터를 추출
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100;

            // 근무일의 출근 시간이 희망 출근 시간 +10min에 부합하는지 판단
            // 먼저 희망 근무시간에 일괄적으로 10분을 더하고 60진법으로 변환하자
            minute += 10;
            if (minute >= 60) {
                hour += minute / 60;
                minute = minute % 60;
                System.out.println("변환한 시간: " + hour + "시 " + minute + "분");
            }

            int lateTime = 0;
            for (int j = 0; j < timelogs[i].length; j++) {

                int compareHour = timelogs[i][j] / 100;
                int compareMinute = timelogs[i][j] % 100;

                if (hour < compareHour || (hour == compareHour && minute < compareMinute)) {
                    System.out.println("지각 발생! " + compareHour + "시 " + compareMinute + "분");
                    lateTime++;
                }
            }

            if (lateTime > 0) {
                giftLength--;
            }
        }

        return giftLength;
    }
}