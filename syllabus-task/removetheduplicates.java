import java.util.Arrays;

public class removetheduplicates {

    public static void duplicates(int arr[]) {

        Arrays.sort(arr);

        int arr1[] = new int[arr.length];
        int j = 0;

        arr1[j] = arr[0];
        j++;
        

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr1[j] = arr[i];
                j++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < j; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {20, 10, 10, 30, 40, 50};

        duplicates(arr);
    }
}