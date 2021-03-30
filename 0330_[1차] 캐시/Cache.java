import java.util.*;

public class Cache {
    public int returnMax(ArrayList<Integer> arr) {
        int max = 0;
        for (int i=0;i<arr.size();i++){
            if (arr.get(i)>max){
                max = arr.get(i);
            }
        }
        return max;
    }
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();
        if (cacheSize==0){
            return cities.length * 5;
        }

        for (int i=0;i<cities.length;i++){
            String city = cities[i].toUpperCase(Locale.ROOT);

            if (cache.contains(city)){
                answer++;
                int idx = cache.indexOf(city);
                for (int t=0;t<time.size();t++){
                    time.set(t, time.get(t)+1);
                }
                time.set(idx, 1);
                continue;
            }
            answer += 5;
            if (cache.size() != cacheSize) {
                cache.add(city);
                for (int t=0;t<time.size();t++) {
                    time.set(t, time.get(t)+1);
                }
                time.add(1);
                continue;
            }
            int idx = time.indexOf(returnMax(time));
            for (int t=0;t<time.size();t++) {
                time.set(t, time.get(t)+1);
            }
            time.set(idx, 1);
            cache.set(idx, city);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(new Cache().solution(3,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}

// 테스트 1 〉	통과 (0.13ms, 52.3MB)
// 테스트 2 〉	통과 (0.11ms, 52.7MB)
// 테스트 3 〉	통과 (0.16ms, 52.1MB)
// 테스트 4 〉	통과 (0.22ms, 52.4MB)
// 테스트 5 〉	통과 (0.13ms, 52.1MB)
// 테스트 6 〉	통과 (0.03ms, 52.8MB)
// 테스트 7 〉	통과 (0.03ms, 52.5MB)
// 테스트 8 〉	통과 (0.15ms, 51.9MB)
// 테스트 9 〉	통과 (0.14ms, 51.8MB)
// 테스트 10 〉	통과 (1.28ms, 51.9MB)
// 테스트 11 〉	통과 (184.07ms, 85.7MB)
// 테스트 12 〉	통과 (0.65ms, 52.3MB)
// 테스트 13 〉	통과 (1.28ms, 54.5MB)
// 테스트 14 〉	통과 (2.88ms, 53.3MB)
// 테스트 15 〉	통과 (2.41ms, 52MB)
// 테스트 16 〉	통과 (6.09ms, 52.3MB)
// 테스트 17 〉	통과 (0.04ms, 52.7MB)
// 테스트 18 〉	통과 (9.55ms, 52.8MB)
// 테스트 19 〉	통과 (11.30ms, 52.7MB)
// 테스트 20 〉	통과 (15.59ms, 52.4MB)
