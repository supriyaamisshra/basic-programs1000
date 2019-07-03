package verybasicprograms.loop;

public class ForLoop {
    public static void main(String[] args) {
        int n =100;
        int s = 10;
        System.out.println("Starting for loop. ");
        for (int i = 0; i <= n; i++) {

            System.out.println(" "+ i);

        }
        System.out.println("starting pre-increment for loop. let's see the change ");
        for (int j = 0; j <= s; ++j) {
            System.out.println(" "+ j);
        }

    }
}
