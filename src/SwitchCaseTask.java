public class SwitchCaseTask {
    public static void main(String[] args) {
        String months = "Февраль";
        String currentMonths = "Февраль";

        if(months.equals(currentMonths)){
                System.out.println("Зима");
            } else if (months == "Февраль") {
                System.out.println("Зима");
            } else if (months == "Декабрь") {
                System.out.println("Зима");
            } else if (months == "Апрель") {
                System.out.println("Весна");
            } else {
            System.out.println("Нет такого месяца");
        }
    }
}
