public class TestResizeableSquare {
    public static void main(String[] args) {
        ResizeableSquare demo=new ResizeableSquare("green",true,5);
        System.out.println(demo);
        demo.resize(50);
        System.out.println(demo);
    }
}
