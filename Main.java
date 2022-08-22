public class Main {
    public static void main(String[] args) {
        // FIZZBUZZ!!!
        for (int i = 1; i <= 100; ++i){
            String output;
            if (i % 5 == 0 && i % 3 == 0){
                output = "FIZZBUZZ";
            }
            else if (i % 5 == 0) {
                output = "BUZZ";
            }
            else if (i % 3 == 0) {
                output = "FIZZ";
            }
            else{
                output = "" + i ;
            }
            System.out.println(output);
        }
    }
}