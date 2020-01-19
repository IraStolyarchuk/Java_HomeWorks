
public class homeWork4_1 {
    public static void main(String[] args) {

        String word = "Hello";
        System.out.println(word);
        uniqueCharacters(word);
    }

    public static void uniqueCharacters(String unique) {
        String temp = "";
        for (int i = 0; i < unique.length(); i++) {
            if (temp.indexOf(unique.charAt(i)) == -1) {
                temp = temp + unique.charAt(i);
            }
        }

        System.out.println(temp + " ");

    }
}