/**
 * Created by Jake on 04/06/2014.
 */
public class Boot {

    public static void main(String[] args) {
        System.out.println(Math.random());

        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exceptions");
        }
    }
}
