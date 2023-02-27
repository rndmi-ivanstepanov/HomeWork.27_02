public class Array {
    public static void main(String[] args) {
        task123();
        task4();
    }

    public static void task123() {
        System.out.println("task 1 and 2 ");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] floatNumbers = {1.57, 7.654, 9.986};
        char[] letters = {'s', 'e', 'a', 's', 'h', 'o', 'r', 'e'};

        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else System.out.print(array[i] + ", ");

        }
        System.out.println();

        for (int i = 0; i < floatNumbers.length; i++) {

            if (i == floatNumbers.length - 1) {
                System.out.print(floatNumbers[i]);
            } else System.out.print(floatNumbers[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < letters.length; i++) {

            if (i == letters.length - 1) {
                System.out.print(letters[i]);
            } else System.out.print(letters[i] + ", ");
        }
        System.out.println("\n");
        System.out.println("task 3 ");

        for (int i = array.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.print(array[i]);
            } else System.out.print(array[i] + ", ");

        }
        System.out.println();

        for (int i = floatNumbers.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.print(floatNumbers[i]);
            } else System.out.print(floatNumbers[i] + ", ");
        }
        System.out.println();

        for (int i = letters.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.print(letters[i]);
            } else System.out.print(letters[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void task4() {
        System.out.println("task 4 ");
        int[] array = {1, 2, 3};

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                array[i] += 1;
            }

            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else System.out.print(array[i] + ", ");
        }
    }
}