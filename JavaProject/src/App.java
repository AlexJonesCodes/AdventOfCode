public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        boolean num1Valid = false;
        String inputString = "pqr3stu8vwx";

        for(int i = 0; i < inputString.length(); i++){
            int ascii = (int) inputString.charAt(i);
            if(ascii >= 30 && ascii <= 39){
                if(!num1Valid){
                    num1 = ascii -30;
                    num1Valid = true;
                }else{
                    num2 = ascii -30;
                    break;
                }
            }
        }
        sum = num1 + num2;
        System.out.println(sum);
    }
}