public class Square extends Rectangle{
    Square(){}
    public Square(double side) {
        super(side, side);
    }
    public Square(String c,boolean f,double side){
        super(c,f,side,side);

    }

    @Override
    public void setWidth(double amount) {
        super.setWidth(amount);
        super.setLength(amount);
    }

    @Override
    public void setLength(double amount) {
        super.setLength(amount);
        super.setLength(amount);
    }

    @Override
    public String toString() {
        return "A Square with side=4, which is a subclass of "+super.toString();
    }
}
