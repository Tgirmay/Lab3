
public  class SquareTester{
    public static void main(String[] args) {
        Rectangle joe = new Rectangle();
        joe.setLength(5);
        joe.setHeight(1);
        System.out.println(joe.perimeter());
        System.out.println(joe.area());
        System.out.println(joe.getRectangleID());
        joe.toString();

        Rectangle jooe = new Rectangle();
        jooe.setLength(9);
        jooe.setHeight(1);
        System.out.println(jooe.perimeter());
        System.out.println(jooe.area());
        System.out.println(jooe.getRectangleID());

        System.out.println("test: " + joe.equals(jooe));

        Square josh = new Square(8);
        josh.toString();

        System.out.println("Area: " + josh.area());
        System.out.println("Perimeter: " + josh.perimeter());

        Square jim = new Square(8.0);
        System.out.println(jim.equals(josh));
    }
}

