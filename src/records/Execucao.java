package records;

public class Execucao {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p.x()); // Saída: 10
        System.out.println(p.y()); // Saída: 20
        System.out.println(p);     // Saída: Point[x=10, y=20]
    }
}
