package h2;

    public class H2_main {
        public static void main(String[] args) {

            int i = 8;
            int j = 3;
            int k = 11;

            int min = i;
            int max = i;

            if (j < min) {
                min = j;
            }
            if (k < min) {
                min = k;
            }

            if (j > max) {
                max = j;
            }
            if (k > max) {
                max = k;
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
    }

