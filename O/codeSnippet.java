//Violation of OCP 

class Rectangle {
    public double width;
    public double length;
}
 
class AreaCalculator {
    public double calculateArea(Rectangle rectangle ) {
        return rectangle.width * rectangle.length;
    }
}

//Adhering to OCP

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    public double width;
    public double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape {
    public double radius;
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

//Now, you can add new shapes (e.g., Circle) without modifying the AreaCalculator class.