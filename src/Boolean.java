public class Boolean {
    public static void main(String[] args) {

        int time = 10;
        boolean isGoodWeather = true;
        boolean dayTime = time >= 23 || time <= 5;

        if (dayTime) {
            System.out.println("Пошли спать!");
        }

        if (!dayTime && isGoodWeather) {
            System.out.println("Ура, идем гулять!");
        }

        if (!dayTime && !isGoodWeather) {
            System.out.println("Остаемся дома и читаем книгу!");
        }
    }
}
