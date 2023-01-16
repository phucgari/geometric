import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] recs=new Rectangle[2];
        recs[0] = new Rectangle(3,4);
        recs[1] = new Rectangle(6,7);
        RectangleAreaComparator comparator=new RectangleAreaComparator();
        int result=comparator.compare(recs[0],recs[1]);
        switch (result){
            case -1:
                System.out.println("rec1<rec2");
                break;
            case 0:
                System.out.println("rec1=rec2");
                break;
            case 1:
                System.out.println("rec1>rec2");
                break;
        };

    }
}