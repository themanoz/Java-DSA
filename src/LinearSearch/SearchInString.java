package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Kunal";

        char target = 'l';
        System.out.println(search(name,target));
    }

    public static boolean search(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
