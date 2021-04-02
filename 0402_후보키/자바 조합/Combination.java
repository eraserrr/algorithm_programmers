public class Combination {
    public int combination(int sum, int[] arr, boolean[] visited, int r, int start, int end) {
        if (r==0){
            for (int i=0;i<arr.length;i++) {
                if (visited[i]){
                    System.out.print(arr[i] +" ");
                }
            }
            System.out.println(" => " + sum++);
            return sum;
        }

        for (int i=start;i<end;i++) {
            visited[i] = true;
            sum = combination(sum, arr, visited, r-1, i+1, end);
            visited[i] = false;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        boolean[] visited = new boolean[arr.length];

        System.out.println(new Combination().combination(0, arr, visited, 3, 0,arr.length));
    }
}
