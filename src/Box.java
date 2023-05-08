public class Box {

    double width;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;

    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }

    Box() {
        height = 0;
        width = 0;
        length = 0;
    }

    int compare (Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();

        if(thisVolume > boxVolume) {
            return -1;
        } else if (thisVolume < boxVolume) {
            return 1;
        } else {
            return 0;
        }

        void getBox(Box box) {

        }
    }
}
