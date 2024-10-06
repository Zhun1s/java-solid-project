// Shape.java
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if(radius <= 0)
            throw new IllegalArgumentException("Radius should be positive");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if(width <= 0 || height <= 0)
            throw new IllegalArgumentException("Width and height should be positive");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// Triangle class
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if(sideA <= 0 || sideB <= 0 || sideC <= 0)
            throw new IllegalArgumentException("Sides must be positive numbers.");
        if(sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA)
            throw new IllegalArgumentException("Triangle inequality violated.");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        // Heron's formula
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

// Square class
class Square extends Shape {
    private double side;

    public Square(double side) {
        if(side <= 0)
            throw new IllegalArgumentException("Side must be positive.");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
