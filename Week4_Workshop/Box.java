public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    public Box(double length, double breadth, double height) {
        this.width = length;
        this.height = breadth;
        this.depth = height;
    }

    public Box() {
        this.width = 10;
        this.height = 8;
        this.depth = 12;
    }

    public void getVolume() {
        double volume = width * height * depth;
        System.out.println("Volume of the box: " + volume);
    }

    public static void main(String[] args) {
        Box cube = new Box(5);
        cube.getVolume();

        Box cuboid = new Box(5, 3, 2);
        cuboid.getVolume();

        Box defaultBox = new Box();
        defaultBox.getVolume();
    }
}
