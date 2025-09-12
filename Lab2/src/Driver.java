import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Golfer> golfers = new ArrayList<Golfer>();
        
        Golfer g1 = new Golfer("Jay", "Smith", -13 , 17);
        Golfer g2 = new Golfer("DeShaun", "Smith", -11 , 16);
        Golfer g3 = new Golfer("DeShaun", "Tayor", -11 , 2);

        golfers.add(g1);
        golfers.add(g2);
        golfers.add(g3);

        System.out.println(golfers.toString());

        Collections.sort(golfers);
        System.out.println(golfers.toString());
    }
}
