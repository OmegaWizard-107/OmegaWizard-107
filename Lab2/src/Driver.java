import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Golfer> golfers = new ArrayList<Golfer>();
        
        // Creates 3 new golfers 
        Golfer g1 = new Golfer("Jay", "Smith", -13 , 17);
        Golfer g2 = new Golfer("DeShaun", "Smith", -11 , 16);
        Golfer g3 = new Golfer("DeShaun", "Tayor", -11 , 2);
        
        //adds golfers to the array in an unsorted order
        golfers.add(g2);
        golfers.add(g1);
        golfers.add(g3);

        //prints the unsorted array
        System.out.println(golfers.toString());

        //sorts then prints the array
        Collections.sort(golfers);
        System.out.println(golfers.toString());
    }
}
    
