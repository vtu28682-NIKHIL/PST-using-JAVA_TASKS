public class squareofNumber {

    public static int sqnm(int arr[]) {
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            ans = arr[i] * arr[i];
            System.out.print(ans + " ");
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6};

        System.out.println(sqnm(arr));
    }
}