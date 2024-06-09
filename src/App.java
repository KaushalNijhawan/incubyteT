
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers below you want to add !");
        String numbers  = br.readLine();
        try {
            System.out.println(add("//;\n1;2,-1,2,-2"));    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static int add(String numbers) throws Exception{
        if (numbers.length() == 0 ) {
            return 0 ;
        }
        if (numbers.contains("//")) {
            numbers = numbers.replaceAll("//", ",");
            
        }
        if (numbers.contains(";")) {
            numbers = numbers.replaceAll(";", ",");
        }        
        int addVal = 0 ;
        numbers = numbers.replaceAll("\n", ",");
        String[] str = numbers.trim().split(",");

        // check for delimetres
        
        StringBuilder negativeNumberString = new StringBuilder("");

        for (String val : str) {
            if (val.equals("")) {
                addVal += 0;
            }else{
                int valCurrent = Integer.parseInt(val);
                if (valCurrent < 0 ) {
                    negativeNumberString.append(valCurrent);
                    negativeNumberString.append(",");
                }
                addVal += valCurrent;
            }
        }
        if (negativeNumberString.length() > 0 ) {
            throw new NumberFormatException("negative numbers not allowed " + negativeNumberString.toString().substring(0, negativeNumberString.length()-1));
        }
        return addVal;
    }
}
