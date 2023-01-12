public class Circle extends Shape {
    private double radius=0;
    Circle(){
        radius=1;
    }
    Circle(double r){
        radius=r;
    }
    Circle(String color,boolean filled,double r){
        super.setColor(color);
        super.setFilled(filled);
        radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "A Circle with radius= "+radius+" , which is a subclass of"+ super.toString();
    }
}
