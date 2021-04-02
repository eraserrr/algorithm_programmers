public class Permutation {
    public void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            for (int i=0;i<output.length;i++) {
                System.out.print(output[i]);
            }
            System.out.println();
            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;;
            }
        }
    }
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        new Permutation().permutation(arr, output, visited, 0, n, 3);
    }
}
