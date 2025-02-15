public class Triangle extends Figure{

    private int sideA, sideB, sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
