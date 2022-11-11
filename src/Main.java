import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        ///Task 1

        double sum = 0;

        for(int element: arr){

            sum += element;

        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        ///Task 2

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        System.out.println("Минимальная сумма трат за день составила " + arr2[0] + " рублей. Максимальная сумма трат за день составила " + arr2[arr2.length - 1] +
                " рублей.");

        ///Task 3

        double average = 1;
        average = sum / arr.length;
        String averageRounded = String.format("%.4f", average);

        System.out.println("Средняя сумма трат за месяц составила " + averageRounded + " рублей.");


        ///Task 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = (reverseFullName.length - 1) ; i >= 0; i--){

            System.out.print(reverseFullName[i]);

        }

        System.out.println();






    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}