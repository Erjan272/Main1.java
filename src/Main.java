public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Круг ",21);
        Triangle triangle = new Triangle("\nТреугольник ",3,4,5);
        Square square = new Square("\nКвадрат ",24);

        Figure[] figures = {circle,triangle,square};
        for(int i = 0; i < figures.length; i++)
        {
            System.out.printf(figures[i].getName() + "Периметр -> " + figures[i].calculatePerimeter());
        }
    }
}