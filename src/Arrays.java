public class Arrays {
    public static void main(String[] args) {
//        int[] nums = new int[100];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i * 10;
//        }
//
//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }

        // Создвание массива быстрым способом
        int[] daysOfMonths = {31, 28, 31, 30, 31, 30,31,30,31,30,31};
        for(int i : daysOfMonths) {
            System.out.println(i);
        }

        java.lang.String name = "Иван";
        int age = 25;
        java.lang.String info = "Привет, \"" + name + "\"! \nТебе " + age + " лет!";
        System.out.println(info);
    }
}
