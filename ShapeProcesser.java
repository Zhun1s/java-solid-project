interface ShapePrinter {
    void printArea(Shape shape);
    void printPerimeter(Shape shape);
}

class ConsoleShapePrinter implements ShapePrinter {
    @Override
    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

    @Override
    public void printPerimeter(Shape shape) {
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
}

class ShapeProcessor {
    private final ShapePrinter printer;

    public ShapeProcessor(ShapePrinter printer) {
        this.printer = printer;
    }

    public void processShape(Shape shape) {
        printer.printArea(shape);
        printer.printPerimeter(shape);
    }
}