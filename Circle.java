public class Circle extends Shape {
    
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print() {
        System.out.println("--Circle--");
        super.print();
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + (3.14 * getRadius() * getRadius()));
    }
    


    

}