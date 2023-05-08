public class Monster {
    int eyes;
    int legs;
    int heands;


    public Monster() {
        eyes = 2;
        heands = 2;
        legs = 2;
    }

    Monster(int eyes) {
        this.eyes = eyes;
        legs = 2;
        heands = 2;
    }

    Monster(int legs, int heands) {
        this.legs = legs;
        this.heands = heands;
        eyes = 2;
    }

    Monster(int eyes, int heands, int legs) {
        this.eyes = eyes;
        this.heands = heands;
        this.legs = legs;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int key) {
        for(int i = 0; i < key; i++) {
            System.out.println("Голос");
        }
    }
    void voice(int key, String word) {
        for(int i = 0; i < key; i++) {
            System.out.println(word);
        }
    }
}
