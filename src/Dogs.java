public class Dogs {

    String name;
    String breed;
    int speed;

    void run() {
        String result = "";

        for(int i = 0; i < speed; i++) {
            result += "бегу";
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

     String info() {
        return ("Кличка собаки - " + name + "\nПорода - " + breed + "\nСкорость - " + speed);
    }
}



