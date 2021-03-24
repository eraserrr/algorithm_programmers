class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String tmp = "";
        
        for (int i=0;i<s.length();i++) {
            if (sb.length() == 0){
                sb.append(s.charAt(i));
                // tmp = tmp + s.charAt(i);
                continue;
            }
            if (s.charAt(i) == sb.charAt(sb.length()-1)) {
                // tmp = tmp.substring(0,tmp.length()-1);
                sb = sb.deleteCharAt(sb.length()-1);
                continue;
            }
            sb.append(s.charAt(i));
            // tmp = tmp + s.charAt(i);
        }
        // System.out.println(sb.toString());
        if (sb.length()==0)
            return 1;
        return 0;
    }
}
