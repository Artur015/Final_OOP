package View;
import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);

    public Double inputX(String msg){
        System.out.println(msg);
        return scan.nextDouble();
    }
    public Double inputY(String msg){
        System.out.println(msg);
        return scan.nextDouble();
    }

    public int getChoise(){
        System.out.println("Выберите операцию:");
        System.out.println("\t1. Сложение");
        System.out.println("\t2. Вычитание");
        System.out.println("\t3. Умножение");
        System.out.println("\t4. Деление");
        System.out.print(": ");
        return scan.nextInt();
    }
}
