package Workbench;


import java.util.Date;

public class StringBuilders {
    public static void main(String[] args) {

        String stringRawA = "a";
        String stringRawB = "";

        Date startTime = new Date();

            for (int a=0; a<10_000; a++) {
                stringRawB = stringRawB + (stringRawA + "bcdefghi ");
            }
        Date endTime = new Date();

        System.out.println("string RAW .length: "+ stringRawB.length() );
        System.out.println("    operation time: "+ (endTime.getTime() - startTime.getTime()) + "ms");


        StringBuilder stringBuilder = new StringBuilder();

            startTime = new Date();

        for (int a=0; a<3_000_000; a++) {
                stringBuilder.append(stringRawA + "bcdefghi ");
        }
            endTime = new Date();

        System.out.println("stringBuild.length: "+ stringBuilder.length() );
        System.out.println("    operation time: "+ (endTime.getTime() - startTime.getTime()) + "ms");
    }
}

/*
        long start = System.nanoTime();
        long end = System.nanoTime();
 */