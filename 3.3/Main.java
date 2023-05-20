public class Main {
    public static void main(String[] args) {
        sumAreas sumAreas = new sumAreas();

        Circle c1 = new Circle(1);
        Circle c2 = new Circle(1);

        Rectangle r1 = new Rectangle(1,2);
        Rectangle r2 = new Rectangle(2,3);

        sumAreas.addShape(c1);
        sumAreas.addShape(c2);
        sumAreas.addShape(r1);
        sumAreas.addShape(r2);

        System.out.println(sumAreas.computeSumAreas());

    }
}
