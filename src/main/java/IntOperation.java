import java.util.Scanner;

public class IntOperation {
    static Scanner scanner = new Scanner(System.in);
    public static int getInt(){

        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.print("ужно значение типа инт");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else{
            System.out.print("Повториte, не то ввел");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int num1, char operation, int num2){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("надо ввести другое значение");
                result = calc(num1, getOperation(),num2);
        }
        return result;
    }
}
