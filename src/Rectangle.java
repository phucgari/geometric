public class Rectangle extends Shape {
    private double width=0;
    private double length=0;
    Rectangle(){
        width=1;
        length=1;
    }
    Rectangle(double a,double b){
        width=a;
        length=b;
    }
    Rectangle(String color,boolean filled,double a,double b){
        super(color,filled);
        width=a;
        length=b;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }
}
