public class Rect {

    double height;
    double weight;

    void getParams(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    double getPerimeter() {
        return (weight + height) * 2;
    }

    double getSquare() {
        return weight * height;
    }
}


