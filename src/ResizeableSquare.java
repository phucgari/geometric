public class ResizeableSquare extends Square implements Resizeable{
    ResizeableSquare(){}

    ResizeableSquare(double side){
        super(side);
    }
    ResizeableSquare(String c,boolean f,double side){
        super(c,f,side);
    }
    @Override
    public void resize(double percent) {
        super.setSide(getSide()*percent/100);
    }
}
