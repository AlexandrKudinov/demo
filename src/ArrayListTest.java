import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    private static List<String> validTypesList;

    public static void main(String[] args) {
        validTypesList = new ArrayList<>();
        validTypesList.add(".jpeg");
        validTypesList.add(".jpg");
        validTypesList.add(".png");
        System.out.println(validTypesList.contains(".jpeg"));
    }
}
