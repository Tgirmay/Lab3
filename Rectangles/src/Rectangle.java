public class Rectangle {
    double length = 0;
    double height = 0;
    public static int rectangleID = 0;



    public  Rectangle(){
        rectangleID++;
        this.rectangleID = rectangleID;

    }
    public Rectangle(double l, double w){
        if(l > 0){
            length = l;
        }
        if( w > 0){
            height = w;
        }
        rectangleID++;
        this.rectangleID = rectangleID;
    }

    @Override public String toString(){
        System.out.println("This is a Rectangle with a length of: " + this.getLength() +" and a height of: " + this.getHeight() + ".");
        return null;
    }

    //Methods
    public void setLength(double l){
        if(l > 0){
            this.length = l;
        }
    }

    public void setHeight(double w){
        if(w > 0){
            this.height= w;
        }
    }

    public double getLength(){
        return this.length;
    }

    public double getHeight(){
        return this.height;
    }

    public int getRectangleID(){
        return this.rectangleID - 1;
    }


    public double perimeter(){
        double perimeter = 2 * this.length + 2 * this.height;
        return perimeter;
    }

    public double area(){
        double area = this.length * this.height;
        return area;
    }

    @Override public boolean equals(Object obj){
        Rectangle rec = (Rectangle) obj;
        if(this.length == rec.length && this.height == rec.height){
            return true;
        }
        else{
            return false;
        }
    }
}
