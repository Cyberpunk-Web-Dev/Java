interface Shape {
    double area();
    double perimeter();
  }
  
  class Circle implements Shape {
    private double radius;
  
    public Circle(double r) {
      radius = r;
    }
  
    public double area() {
      return Math.PI * radius * radius;
    }
  
    public double perimeter() {
      return 2 * Math.PI * radius;
    }
  }
  
  class Rectangle implements Shape {
    private double width;
    private double height;
  
    public Rectangle(double w, double h) {
      width = w;
      height = h;
    }
  
    public double area() {
      return width * height;
    }
  
    public double perimeter() {
      return 2 * (width + height);
    }
  }
  
  class Square implements Shape {
    private double side;
  
    public Square(double s) {
      side = s;
    }
  
    public double area() {
      return side * side;
    }
  
    public double perimeter() {
      return 4 * side;
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Shape c = new Circle(5.0);
      System.out.println("Circle Area: " + c.area());
      System.out.println("Circle Perimeter: " + c.perimeter());
  
      Shape r = new Rectangle(4.0, 5.0);
      System.out.println("Rectangle Area: " + r.area());
      System.out.println("Rectangle Perimeter: " + r.perimeter());
  
      Shape s = new Square(3.0);
      System.out.println("Square Area: " + s.area());
      System.out.println("Square Perimeter: " + s.perimeter());
    }
  }
  