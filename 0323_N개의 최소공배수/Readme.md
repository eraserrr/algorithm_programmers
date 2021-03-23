```
class Solution {
    public int solution(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (max<num) {
                max = num;
            }
        }
        int answer = 1;
        int val = 2;
        while (true) {
            int[] quotient = new int[arr.length];
            int commonDivisor = 0;
            int partial = 1;
            
            for (int j=0;j<arr.length;j++) {
                if (arr[j]%val == 0) {
                    quotient[j] = arr[j]/val;
                    commonDivisor++;
                }
                else {
                    quotient[j] = arr[j];
                }
            }
            
            if (commonDivisor>=2) {
                answer = answer * val;
                val=2;
                for (int i=0;i<arr.length;i++) {
                    arr[i] = quotient[i];
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else if (val<max){
                val++;
            }
            else {
                System.out.println(val + " 공약수가 존재하지 않음");
                for (int num:arr) {
                    answer *= num;
                }
                break;
            }
        }
        return answer;
        
    }
}
```
테스트 1 〉	통과 (9.37ms, 52.8MB)<br>
테스트 2 〉	통과 (9.15ms, 52.4MB)<br>
테스트 3 〉	통과 (9.76ms, 52.3MB)<br>
테스트 4 〉	통과 (9.39ms, 52.8MB)<br>
테스트 5 〉	통과 (9.10ms, 53.3MB)<br>
테스트 6 〉	통과 (9.91ms, 52.8MB)<br>
테스트 7 〉	통과 (15.57ms, 52.9MB)<br>
테스트 8 〉	통과 (9.68ms, 52.9MB)<br>
테스트 9 〉	통과 (9.06ms, 52.6MB)<br>
테스트 10 〉	통과 (10.74ms, 53.5MB)<br>
자바 넘나 힘들당;
