import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task123 {
    static final InputStreamReader reader = new InputStreamReader(System.in);
    static final BufferedReader br = new BufferedReader(reader);

    public static void main(String[] args) throws IOException {
        printNumber();
        printName();
        printArray();
    }


    /**
     * 1.Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     */
    public static void printNumber() throws IOException {
        System.out.println("Введите число");
        int number = Integer.parseInt(br.readLine());

        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Вы ввели число меньше 7");
        }
    }

    /**
     * 2.Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
     * если нет, то вывести "Нет такого имени"
     */
    public static void printName() throws IOException {
        System.out.println("Введите имя");

        //Преобразовываем введенное имя в нижний регистр//
        String name = br.readLine().toLowerCase();

        if (name.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    /**
     * 3.Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     */
    public static void printArray() throws IOException {
        System.out.println("Введите размер массива");
        int size = Integer.parseInt(br.readLine());
        int[] array = new int[size];

        System.out.println("Введите числа массива через пробел");
        String[] array2 = br.readLine().split(" ");

        for (int i = 0; i < array2.length; i++) {
            array[i] = Integer.parseInt(array2[i]);
        }

        System.out.print("Элементы массива кратные 3: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
