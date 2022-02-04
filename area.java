class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println(breadth * length);
    }

    public void perimeter() {
        System.out.println(2 * (breadth + length));
    }
}
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Rectangle square = new Square(10);
        rectangle.area();
        rectangle.perimeter();
        System.out.println();
        square.area();
        square.perimeter();
    }
}







//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively.
//Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
//class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter
//of a rectangle and a square. 
//Square(int s){ 
//Super(s,s) 
//}
