package JavaoopsPackage;

public class Circle{

	
	    private double radius;

	    // No-argument constructor (radius = 0)
	    public Circle() {
	        this.radius = 0.0;
	    }

	    
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    
	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    
	    public double getRadius() {
	        return radius;
	    }

	    
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }
	
    public static void main(String[] args) {
        Circle circle1 = new Circle();            // radius 0.0
        Circle circle2 = new Circle(5.0);         // radius 5.0

        System.out.println("Circle1 Circumference: " + circle1.getCircumference());
        System.out.println("Circle2 Circumference: " + circle2.getCircumference());
    }
}
