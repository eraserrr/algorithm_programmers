// List 는 ArrayList 의 인터페이스이다.
// 자바 문자열 짜를 때에는 substring(int start, int end) 혹은 split(String ) 이용하기
// hashMap 에서 get, put 이용. key 확인은 containsKey() 함수 이용

import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap();

        for(int i=record.length-1;i>=0;i--) {
            String[] input = record[i].split(" ");
            if (input[0].equals("Leave")){
                continue;
            }
            if (hashMap.containsKey(input[1])==false) {
                hashMap.put(input[1], input[2]);
            }
        }

        for (int i=0;i< record.length;i++) {
            String[] input = record[i].split(" ");
            if (input[0].equals("Change"))
                continue;
            String msg = "";
            if (input[0].equals("Enter"))
                msg = "들어왔습니다.";
            else {
                msg = "나갔습니다.";
            }
           answer.add(hashMap.get(input[1]) + "님이 " + msg);
        }

        String[] a = answer.toArray(new String[answer.size()]);
        return a;
    }
}
// 테스트 1 〉	통과 (12.43ms, 53.3MB)
// 테스트 2 〉	통과 (12.03ms, 53MB)
// 테스트 3 〉	통과 (16.58ms, 52.6MB)
// 테스트 4 〉	통과 (12.67ms, 53MB)
// 테스트 5 〉	통과 (28.54ms, 54.7MB)
// 테스트 6 〉	통과 (22.43ms, 54.7MB)
// 테스트 7 〉	통과 (21.37ms, 55.3MB)
// 테스트 8 〉	통과 (27.34ms, 54MB)
// 테스트 9 〉	통과 (23.58ms, 54.7MB)
// 테스트 10 〉	통과 (22.57ms, 54.3MB)
// 테스트 11 〉	통과 (29.24ms, 54.6MB)
// 테스트 12 〉	통과 (18.68ms, 53.8MB)
// 테스트 13 〉	통과 (23.42ms, 54.3MB)
// 테스트 14 〉	통과 (23.82ms, 56.3MB)
// 테스트 15 〉	통과 (11.15ms, 52.3MB)
// 테스트 16 〉	통과 (12.02ms, 53MB)
// 테스트 17 〉	통과 (19.60ms, 53.1MB)
// 테스트 18 〉	통과 (12.25ms, 63.3MB)
// 테스트 19 〉	통과 (23.08ms, 56.2MB)
// 테스트 20 〉	통과 (25.97ms, 54.4MB)
// 테스트 21 〉	통과 (20.89ms, 54.5MB)
// 테스트 22 〉	통과 (28.17ms, 54.3MB)
// 테스트 23 〉	통과 (23.59ms, 55.2MB)
// 테스트 24 〉	통과 (23.92ms, 54.7MB)
// 테스트 25 〉	통과 (248.28ms, 151MB)
// 테스트 26 〉	통과 (286.79ms, 165MB)
// 테스트 27 〉	통과 (298.58ms, 167MB)
// 테스트 28 〉	통과 (353.75ms, 171MB)
// 테스트 29 〉	통과 (319.10ms, 168MB)
// 테스트 30 〉	통과 (224.21ms, 159MB)
// 테스트 31 〉	통과 (269.52ms, 155MB)
// 테스트 32 〉	통과 (285.57ms, 144MB)
