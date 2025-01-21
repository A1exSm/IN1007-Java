package weekNine;

class Circle {
    private int radius;
    private final static double PI = 3.14;
    // constructors
    protected Circle(int radius) {
        this.radius = radius;
        newObject();
    }
    protected Circle() {
        this.radius = 1;
        newObject();
    }
    // getters and setters
    protected int getRadius() {
        return radius;
    }
    protected void setRadius(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException();
        } else {
            this.radius = radius;
        }
    }
    // surface method
    private double surfaceArea() {
        return PI * radius * radius; // PI*radius^2 = PI * radius * radius
    }
    // num circles
    private static int numOfCircles = 0;
    protected int getNumOfCircles() {
        return numOfCircles;
    }
    protected void setNumOfCircles(int num) {
        numOfCircles = num;
    }
    // total surface
    private static double totalSurface = 0;
    protected double getTotalSurface() {
        return totalSurface;
    }
    protected void setTotalSurface(double newSurface) {
        totalSurface = newSurface;
    }
    // class initialisation function for static variables
    private void newObject() {
        setNumOfCircles(numOfCircles+1);
        setTotalSurface(totalSurface+=this.surfaceArea());
    }
}
