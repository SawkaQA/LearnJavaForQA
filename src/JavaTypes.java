public class JavaTypes {
    public static void main(String[] args) {

        // Целые цисла
        byte numberByte = 5; // 1 байт (-128 до 127)
        short numberShort = 32762; // 2 байта (-32768 до 32767)
        int numberInt = 2147483647; // 4 байта (-2147483748 до 2147483647)
        long numberLong = 1123434234; // 8 байт (-много до +много)

        // Числа с плавающей точкой
        float numberFloat = 10.12f; // 4 байта (небольшая точность)
        double numberDouble = 12.1223123; // 8 байт (большая точность)

        // Символьный тип (целочисленный тип) ASCII
        char ch1 = 89;
        ch1 += 1;
        char ch2 = 'Y';

        // Логический тип данных boolean

        boolean late = false;
        boolean hot = true;
    }
}
