class NLCM {
    public int nlcm(int[] num) {
        int answer = num[0],g;
        for(int i=1;i<num.length;i++){
            g=gcd(answer,num[i]);
            answer=g*(answer/g)*(num[i]/g);
        }
        return answer;
    }
    public int gcd(int a,int b){
        if(a>b)
            return (a%b==0)? b:gcd(b,a%b);
        else 
            return (b%a==0)? a:gcd(a,b%a);
    }
}
class Solution {
    public int solution(int[] arr) {
        NLCM c = new NLCM();
        return c.nlcm(arr);
    }
}

