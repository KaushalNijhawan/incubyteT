
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers below you want to add !");
        String numbers  = br.readLine();
    }

    public static int add(String numbers){
        if (numbers.length() == 0 ) {
            return 0 ;
        }        
        int addVal = 0 ;
        String[] str = numbers.trim().split(",");
        for (String val : str) {
            addVal += Integer.parseInt(val);
        }
        return addVal;
    }
}
