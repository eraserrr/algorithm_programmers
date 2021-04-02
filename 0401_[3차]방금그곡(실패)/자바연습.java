import java.util.*;
class Solution {
  public int transTime(String str1, String str2) {
        int a = 60*(Integer.parseInt(str2.split(":")[0])-
                Integer.parseInt(str1.split(":")[0]));
        int b = Integer.parseInt(str2.split(":")[1]) -
                Integer.parseInt(str1.split(":")[1]);
        return a + b;
    }
    public String replaceSharp(String tar) {
        tar = tar.replace("C#","L");
        tar = tar.replace("D#","H");
        tar = tar.replace("F#","I");
        tar = tar.replace("G#","J");
        tar = tar.replace("A#","K");
        return tar;
    }
    public String solution(String m, String[] musicinfos) {
        m = replaceSharp(m);
        Arrays.sort(musicinfos, (a, b) ->
                transTime(b.split(",")[0], b.split(",")[1]) -
                        transTime(a.split(",")[0], a.split(",")[1])

        );

        for (String musicinfo : musicinfos) {
            String[] splited = musicinfo.split(",");
            int time = transTime(splited[0], splited[1]);
            String title = splited[2];
            String sheet = replaceSharp(splited[3]);

            sheet = sheet.repeat(time).substring(0,time);

            if (sheet.contains(m)) {
                return title;
              
            }
        }
        return "(None)";
    }
// }
// 테스트 1 〉	통과 (1.20ms, 52.6MB)
// 테스트 2 〉	통과 (1.67ms, 52.5MB)
// 테스트 3 〉	통과 (1.22ms, 52.1MB)
// 테스트 4 〉	통과 (1.76ms, 52MB)
// 테스트 5 〉	통과 (1.21ms, 51.9MB)
// 테스트 6 〉	통과 (0.88ms, 52.5MB)
// 테스트 7 〉	통과 (3.25ms, 53.6MB)
// 테스트 8 〉	통과 (3.74ms, 52.1MB)
// 테스트 9 〉	통과 (3.23ms, 53.5MB)
// 테스트 10 〉	통과 (3.10ms, 53MB)
// 테스트 11 〉	통과 (3.73ms, 52.2MB)
// 테스트 12 〉	통과 (3.98ms, 52.9MB)
// 테스트 13 〉	통과 (3.48ms, 52.1MB)
// 테스트 14 〉	통과 (3.05ms, 53MB)
// 테스트 15 〉	통과 (5.03ms, 52.6MB)
// 테스트 16 〉	통과 (3.22ms, 52.1MB)
// 테스트 17 〉	통과 (3.46ms, 52.2MB)
// 테스트 18 〉	통과 (3.52ms, 52.7MB)
// 테스트 19 〉	통과 (3.63ms, 52.3MB)
// 테스트 20 〉	통과 (5.51ms, 52.4MB)
// 테스트 21 〉	통과 (3.52ms, 51.9MB)
// 테스트 22 〉	통과 (4.06ms, 52.3MB)
// 테스트 23 〉	통과 (6.13ms, 51.9MB)
// 테스트 24 〉	통과 (4.72ms, 53MB)
// 테스트 25 〉	통과 (1.18ms, 52.5MB)
// 테스트 26 〉	통과 (1.21ms, 51.9MB)
// 테스트 27 〉	통과 (1.48ms, 52MB)
// 테스트 28 〉	통과 (1.34ms, 52.6MB)
// 테스트 29 〉	통과 (25.68ms, 65.3MB)
// 테스트 30 〉	통과 (18.23ms, 61.5MB)
