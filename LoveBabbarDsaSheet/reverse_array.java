import java.util.ArrayList;
import java.util.Scanner;

public class reverse_array {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int s = m + 1;
        int e = arr.size() - 1;
        while (s < e) {
            int temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
        System.out.println("output: \n");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            reverseArray(list, k);
        }
        sc.close();

    }
}
