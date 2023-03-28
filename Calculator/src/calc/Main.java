package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            String output;
            System.out.println("Input: (или введите EXIT для выхода)");
            while (!(input = br.readLine().toUpperCase()).equals("EXIT")) {
                try {
                    ExpressionDTO expr = ExpressionParser.parse(input);
                    output = Calc.calc(expr);
                    System.out.println("Output: " + output);
                    System.out.println("Input: (или введите EXIT для выхода)");
                } catch (CustomException e) {
                    System.out.println(e.toString());
                    System.out.println("Попробуйте ввести выражение снова (или введите EXIT для выхода)...");
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}