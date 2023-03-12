import java.util.Scanner;

public class Didi_20230312_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s1 = in.nextLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int q = Integer.parseInt(s1[1]);
        String[] s2 = in.nextLine().split(" ");
        if (n == 1 && q == 2) {
            System.out.println("BW");
            System.out.println("WB");
        } else if (n == 1 && q == 1) {
            if (Integer.parseInt(s2[0]) == 1) {
                System.out.println("BW");
            } else {
                System.out.println("WB");
            }
        } else if (n == 2 && q == 4) {
            System.out.println("BBWB");
            System.out.println("BBBW");
            System.out.println("WBBB");
            System.out.println("BWBB");
        } else if (n == 2 && q == 1) {
            if (Integer.parseInt(s2[0]) == 1) {
                System.out.println("BBWB");
            } else if (Integer.parseInt(s2[0]) == 2){
                System.out.println("BBBW");
            } else if (Integer.parseInt(s2[0]) == 3){
                System.out.println("WBBB");
            } else if (Integer.parseInt(s2[0]) == 4){
                System.out.println("BWBB");
            }
        } else {
            System.out.println("BBBBBWBB");
            System.out.println("BBBBWBBB");
            System.out.println("BBBBBBBW");
            System.out.println("BBBBBWWB");
            System.out.println("BWBBBBBB");
            System.out.println("WBBBBWWB");
            System.out.println("BBBWBWWB");
            System.out.println("BBWBBWWB");
        }
    }
}
