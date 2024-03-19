package String;

public class Comparison {
    public static void main(String[] args) {
//        String series = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a' + i);
//            series = series + ch;
            builder.append(ch);
        }

//        System.out.println(series);
        System.out.println(builder);
    }
}

