import java.math.BigDecimal;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello world!");

//        long number = 5L;
//        Integer number2 = 5;
//        Integer number3 = new Integer(5);
//        Integer number4 = 5;
//        System.out.println(number2 == number);
//        System.out.println(number == number2);
//        System.out.println(number == number3);
//        System.out.println(number2 == number4);

        String s1 = "ab";
        String s2 = "ab";
        s1 = "abc";
        for (int i = 0; i < 10; i++) {
            s1 += "a";
        }
//        String s3 = null;
//        s3.isEmpty();
////
////        if( s3 == null && s3.isEmpty()) {
////
////        }

        StringBuilder sb = new StringBuilder("Gosho");
        sb.append("&Tosho");
        System.out.println(sb);
    }
}
