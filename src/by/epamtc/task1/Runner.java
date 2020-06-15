package by.epamtc.task1;


import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Runner {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(FinderOfDecision.calcTheValueOfTheExpression(1, 2, 2));
//        double d1 = 0.0f;
//        Double d2 = new Double(.0f);
//       // Double d3 = 0.0f;
//        //Double d4 = new Double("1L");
//        Double d5 = 0.d;
//        //Double d6 = 1L;
//
//        int i1 = Integer.parseInt("14");
//        Integer i2 = 85;
//        //int i3 = Integer.decode('12');
//        int i4 = Integer.valueOf("21");
//
//        int i6 = new Integer("15");
//        System.out.println(new String("null"));
//        //System.out.println((char[])null);
//        System.out.println((true?null:0));
//        System.out.println((String)null);
        String str = "Мама мыла раму!";
        byte[] strCP = str.getBytes();
        int charCode;
        for (byte b : strCP) {
            charCode = b;
            if (charCode < 0) {
                charCode = b + 256;
            }
            System.out.println(charCode + " ");
        }
        System.out.println("____________________________________");
        System.out.println();
        String s;

        for (Enumeration e = System.getProperties().propertyNames(); e.hasMoreElements(); ) {

            s = e.nextElement().toString();

            System.out.println(s + "=" + System.getProperty(s));
        }
        System.out.println();
        System.out.println("______________________________________");
        System.out.println();
        System.out.println("file.encoding before=" + System.getProperty("file.encoding"));

        System.out.println("console.encoding before=" + System.getProperty("console.encoding"));

        System.setProperty("file.encoding", "Cp866");

        System.setProperty("console.encoding", "Cp866");

        System.out.println("file.encoding after=" + System.getProperty("file.encoding"));

        System.out.println("console.encoding after=" + System.getProperty("console.encoding"));

        System.out.println();
        System.out.println("______________________________________");
        System.out.println();

        String s1 = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ";

        String s2 = "абвгдежзийклмнопрстуфхцчшщьыъэюя";

        System.out.println(s1);

        System.out.println(s2);

        System.out.println();
        System.out.println("______________________________________");
        System.out.println();
        String s3 = "\u043A\u043E" +

                "\u0434\u0438\u0440\u043E\u0432" +

                "\u043A\u0430";

        System.out.println(s3);

        System.out.println();
        System.out.println("______________________________________");
        System.out.println();

        String strs = "\u043A\u043E"+
                "\u0434\u0438\u0440\u043E\u0432"+
                "\u043A\u0430";
        byte[] b = strs.getBytes("Cp866");
        String str2 = new String(b,"Cp1251");
        System.out.println(str2);


        long startTime = System.currentTimeMillis();

        System.out.println();
        System.out.println("______________________________________");
        System.out.println();

        List strings = IntStream.rangeClosed(1, 10_000_000)
                .mapToObj(Integer::toString)
                .collect(toList());

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(
                "Generated " + strings.size() + " strings in " + totalTime + " ms.");

        startTime = System.currentTimeMillis();

        String appended = (String) strings.stream()
                .limit(100_000)
                .reduce("", (l, r) -> l.toString() + r.toString());

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Created string of length " + appended.length()
                + " in " + totalTime + " ms.");
    }
}

