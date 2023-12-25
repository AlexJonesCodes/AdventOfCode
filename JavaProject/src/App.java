import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files



public class App {
    public void main(String[] args) throws Exception {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int total = 0;
        boolean num1Valid = false;
        String inputString = "pqr3stu8vwx";
        String[] inputArray =  readTextFile("inputfile.txt");

        for(int j = 0; j < inputArray.length; j++){
            if(inputArray[j] != null){
                inputString = inputArray[j];
                sum = 0;
                for(int i = 0; i < inputString.length(); i++){
                    int ascii = (int) inputString.charAt(i);
                    if(ascii >= 48 && ascii <= 57){
                        if(!num1Valid){
                            num1 = (ascii -48)*10;
                            num1Valid = true;
                        }else{
                            num2 = ascii -48;
                            break;
                        }
            }
        }
        sum = num1 + num2;
        total = total + sum;
        System.out.println(sum);
                break;
            }
        }
        System.out.println("total: " + total);
    }

    public String[] readTextFile(String fileName){
        String Array[] = new String[1000];
        int pos = 0;
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Array[pos] = data;
            }
            myReader.close();
            } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        return Array;
    }
}
