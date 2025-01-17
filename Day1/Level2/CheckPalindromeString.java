import java.util.Scanner;

 class PalindromeChecker{
    String text;
    PalindromeChecker(String text){
        this.text=text;
    }
    boolean isPalindrome(){
        boolean flag=true;
        for(int i=0;i<this.text.length()/2;i++){
            if(this.text.charAt(i)!=this.text.charAt(this.text.length()-i-1)){
                flag= false;
            }
        }
        return flag;
    }

    void displayResult(){
        System.out.println("The given string is palindrome "+this.isPalindrome());
    }
}
public class CheckPalindromeString {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String to check palindrome");
        String text = input.nextLine();

        PalindromeChecker pc = new PalindromeChecker(text);
        pc.displayResult();

    }
}
