package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] parts = fruits.split(",");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
        String joinedString = String.join("->", parts);
        System.out.println("joinedString = " + joinedString);
    }
}
