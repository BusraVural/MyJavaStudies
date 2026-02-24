import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        
        System.out.print("Enter number1 : ");
        number1 = sc.nextInt();

        System.out.print("Enter number2 : ");
        number2 = sc.nextInt();
        
        System.out.println("1 : +, 2 : -, 3 : x, 4 : %");

        System.out.print("Choose your option : ");
        int option = sc.nextInt();

        switch(option){
        case 1 :
            System.out.println("adding : " + (number1+number2));
            break;
        case 2 :
            System.out.println("subtracting : " + (number1-number2));
            break;
        case 3 :
            System.out.println("multiplying : " + (number1*number2));
            break;
        case 4 :
            System.out.println("modulus : " + (number1%number2));
            break;

        default:
        System.out.println("invalid selection");  
  
    }
     sc.close();
}
}