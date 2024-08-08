import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        int[] a = new int[]{1, 2, 3};
        float[] b = {1.57f, 7.654f, 9.986f};
        char [] c = {'x', 'y' , 'z'};
        //task 2
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        //task 3
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }
        for (int i = c.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
        //task 4
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] % 2 != 0) {
                a[i] = a[i] + 1;
            }
            if (i == a.length - 1) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
    }
}