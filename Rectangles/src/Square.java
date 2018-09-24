
public class Square extends Rectangle{
    double sideLength = 0;

    public Square(){
        this.sideLength = 0;
        super.length = this.sideLength;
        super.height = this.sideLength;
    }

    public Square(double s ){
        if (s > 0){
            this.sideLength = s;
            super.length = this.sideLength;
            super.height = this.sideLength;
        }
    }

    public double getSideLength(){
        return this.sideLength;
    }

    @Override public String toString(){
        System.out.println("This is a Square with a side length of: " + this.getSideLength() + ".");
        return null;
    }

     public boolean equals(Object obj){
         Square sq = (Square) obj;
        if(this.sideLength == sq.sideLength){
            return true;
        }
        else{
            return false;
        }
    }
}

