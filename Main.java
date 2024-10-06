import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4, 5));
        shapes.add(new Square(4));
        
        ShapePrinter printer = new ConsoleShapePrinter();
        ShapeProcessor processor = new ShapeProcessor(printer);

        for (Shape shape : shapes) {
            System.out.println("Processing shape: " + shape.getClass().getSimpleName());
            processor.processShape(shape);
            System.out.println();
        }
    }
}