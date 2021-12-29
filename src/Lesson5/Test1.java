package Lesson5;

public class Test1 {
    public static void main(String[] args) {


        String result = "";
        for (String arg : args) {
            result += arg;
            result += ", ";
        }
        System.out.println(result);
    }
}
