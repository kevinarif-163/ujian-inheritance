public class Cube extends Rectangle {
    private int height;

    public Cube(String name, String color,int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print() {
        System.out.println("--Cube--");
        super.print();
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Height: " + getHeight());
        System.out.println("Volume: " + (getHeight() * getLength() * getWidth()));
    }


    
}