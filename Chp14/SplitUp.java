
import java.io.*;

public class SplitUp {
    public static void main(String[] args){
        String s = "Mary had a little lamb";
        String[] splitUp = s.split(" ");
        for (String a:splitUp) {
            System.out.println(a);
        }
    }
}