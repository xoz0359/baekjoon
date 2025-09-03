import java.util.Arrays;
class Solution {
        public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 여기에서부터 동영상 플레이어 조작마다 pos값이 오프닝 시작지점과 오프닝 끝 지점 사이에 위치하는지 검사하고 영상 좌표값을 이동시킨다.
        pos = checkOpTime(pos, op_start, op_end);

        for (String command : commands) {

            if(command.equals("prev")){
                // todo 동영상을 10초 뒤로 넘겼을 때 처리할 로직
                pos = checkOpTime(returnToPrevTime(pos), op_start, op_end);
            }else if (command.equals("next")){
                // todo 동영상을 10초 전으로 되돌렸을 때 처리할 로직
                pos = checkOpTime(returnToNextTime(pos, video_len), op_start, op_end);
            }else{
                return "error: 잘못된 입력 감지";
            }
        }
            return pos;
    }

    public int parseToInt(String timePattern) {
        // 새로운 스트림 메서드 reduce(t, f) t: 초기값 f: 누적 공식
        return Arrays.stream(timePattern.split(":"))
                .mapToInt(Integer::parseInt)
                .reduce(0, (acc, cur) -> acc * 60 + cur);
    }

    public String returnToNextTime(String timePattern, String video_len) {
        int posTime = parseToInt(timePattern) + 10;
        return posTime >= parseToInt(video_len) ? video_len : String.format("%02d:%02d", posTime / 60, posTime % 60);
    }

    public String returnToPrevTime(String timePattern) {
        int posTime = parseToInt(timePattern) - 10;
        return posTime <= 0 ? "00:00" : String.format("%02d:%02d", posTime / 60, posTime % 60);
    }

    public String checkOpTime(String timePattern, String op_start, String op_end) {
        int posTime = parseToInt(timePattern);
        int opStart = parseToInt(op_start);
        int opEnd = parseToInt(op_end);

        return posTime >= opStart && posTime < opEnd ? op_end : timePattern;
    }
}