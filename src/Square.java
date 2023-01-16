public class Square extends Rectangle{
    double side;
    Square(){}
    public Square(double side) {
        super(side, side);
        this.side=side;
    }
    public Square(String c,boolean f,double side){
        super(c,f,side,side);
        this.side=side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side=4, which is a subclass of "+super.toString();
    }
}
