import java.util.ArrayList;
import java.util.List;

public class FunThings {
    public static void main(String[] args) {
        List<Hobby> hobby= new ArrayList<Hobby>();

        hobby.add(new Hobby("Volleyball","ball"));
        hobby.add(new Hobby("Badminton","ShuttleCock"));

        System.out.println(((Hobby) hobby).getResource());


        
        



    }
}
