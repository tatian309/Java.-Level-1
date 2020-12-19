package lesson1;

public class lesson1_hw {

    public static void main(String[] args) {
            System.out.println("Демонстрация усвоенного на уроке материала");

            byte valByte = 4;
            System.out.println("Переменная byte заведена и равнва " + valByte);

            short valShort = 2498;
            System.out.println("Переменная short заведена и равна " + valShort);

            int valInt = -143887;
            System.out.println("Переменная int заведена и равна " + valInt);

            long valLong = 9564873289106054L;
            System.out.println("Переменная long заведена и равна " + valLong);

            float valFloat = 173.4f;
            System.out.println("Перменная float заведена и равна " + valFloat);

            double valDouble = 27.4803;
            System.out.println("перменная double заведена и равна " + valDouble);

            char valChar = '\uf3da';
            System.out.println("Переменная char заведена и равна " + valChar);

            boolean valBoolean = true;
            System.out.println("Переменная boolean заведена и равна " + valBoolean);

            float result1 = calculate (12.4f,2.7f,27.9f,3.1f);
            System.out.println("Согласно вычисленим результат равен " +result1);

            boolean result2 = between10and20(3, 27);
            System.out.println("Согласно сравнению матод возвращает ответ - " + result2);

            boolean result3 = positiveOrNegative(-274); {
                if (result3 == true) {
                    System.out.println("Согласно сравнению заданное число положительное");
                } else {
                    System.out.println("Согласно сравнению заданное число отрицательное");
                }
            }

            boolean result4 = negativeOrPositive(-15);
            System.out.println("Согласно сравнению метод возвращает ответ - " + result4);

            String result5 = name ("Татьяна");
            System.out.println(result5);
    }

    public static float calculate (float a, float b, float c, float d) {
        return a*(b+(c/d));
    }

    public static boolean between10and20 (int x, int y) {
        int sum = x + y;
        if (sum >=10 && sum <=20) return true;
        else return false;
    }

    public static boolean positiveOrNegative (int i) {
        if (i >= 0) return true;
        else return false;
    }

    public static boolean negativeOrPositive (int z) {
        if (z <= 0) return true;
        else return false;
    }

    public static String name (String name) {
        return "Привет, " + name + "!";
    }
}
