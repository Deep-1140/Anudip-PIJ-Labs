class Shape
{
    // getArea method
    public double getArea() {

        return 0.0;
    }

    // Main
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());

        Rectangular rectangle = new Rectangular(10, 4);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Square square = new Square(6);
        System.out.println("Area of Square: " + square.getArea());
    }
}

// Subclass Circle
class Circle extends Shape {
    
    int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Override getArea method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square
class Square extends Shape {
    
    int length;

    // Constructor
    public Square(int length) {
        this.length = length;
    }

    // Override getArea method
    @Override
    public double getArea() {
        return length * length;
    }
}

// Subclass Rectangular
class Rectangular extends Shape {
   
    int width;
    int height;

    // Constructor
    public Rectangular(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Override getArea method
    @Override
    public double getArea() {
        return width * height;
    }
}




