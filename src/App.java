
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers below you want to add !");
        String numbers  = br.readLine();

        System.out.println(add("//;\n1;2"));
    }

    public static int add(String numbers){
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
        

        for (String val : str) {
            if (val.equals("")) {
                addVal += 0;
            }else{
                addVal+= Integer.parseInt(val);
            }
        }
        return addVal;
    }
}
