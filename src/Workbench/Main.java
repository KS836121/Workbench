package Workbench;

public class Main {
    public static void main(String[] args) {

        String s = "a";
        StringBuilder stringBuilder = new StringBuilder("a");
        long start = System.nanoTime();

        for(int i = 0; i < 100_000; i++) {
            s = (s + "a");
            //stringBuilder.append(s + "a");
        }
        System.out.println(s +"/"+ stringBuilder +"\n"+ ((System.nanoTime() - start)/1000_000) );
    }
}


// System.currentTimeMillis();
// stringBuilder.append(stringRawA + "bcdefghi ");
// s = new StringBuilder(s).append("a").toString();