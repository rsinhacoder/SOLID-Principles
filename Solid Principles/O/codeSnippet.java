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



//Problem: Imagine you want to add a new shape, like a Circle, and calculate its area. You would have to modify the AreaCalculator class. You'd likely add an else if or a switch statement to handle the Circle type.

//The AreaCalculator is now modified every time you add a new shape. The OCP states that classes should be open for extension but closed for modification. You're directly changing the AreaCalculator's code to accommodate new shapes. 

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

//The introduction of the Shape interface is the key.  Now, both Rectangle and Circle implement this interface.  This means they both have a calculateArea() method.

// How it adheres to OCP:  You can now create a new AreaCalculator (or modify an existing one slightly if needed) that works with any Shape:

//Now, you can add new shapes (e.g., Circle) without modifying the AreaCalculator class.