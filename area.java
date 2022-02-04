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
