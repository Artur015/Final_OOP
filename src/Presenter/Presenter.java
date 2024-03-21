package Presenter;

import View.UI;
import impl.ComplexNumber;
import impl.operations.*;

public class Presenter<T extends ComplexOP> {

    UI v;
    T model;

    public Presenter(UI v, T model) {
        this.model = model;
        this.v = v;
    }

    public void run(){
        int choise = v.getChoise();
        Double real;
        Double imaginary;

        switch (choise){
            case 1:
                Addition sum = new Addition();
                real = v.inputX("Введите первое число: ");
                imaginary = v.inputY("Введите Мнимую часть первого числа: ");
                ComplexNumber num1_sum = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите второе число: ");
                imaginary = v.inputY("Введите Мнимую часть второго числа: ");
                ComplexNumber num2_sum = new ComplexNumber(real, imaginary);
                sum.operation(num1_sum, num2_sum);
                System.out.println(sum);
                break;
            case 2:
                Subtraction sub = new Subtraction();
                real = v.inputX("Введите первое число: ");
                imaginary = v.inputY("Введите Мнимую часть первого числа: ");
                ComplexNumber num1_sub = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите второе число: ");
                imaginary = v.inputY("Введите Мнимую часть второго числа: ");
                ComplexNumber num2_sub = new ComplexNumber(real, imaginary);
                sub.operation(num1_sub, num2_sub);
                System.out.println(sub);
                break;
            case 3:
                Multiplication multi = new Multiplication();
                real = v.inputX("Введите первое число: ");
                imaginary = v.inputY("Введите Мнимую часть первого числа: ");
                ComplexNumber num1_multi = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите второе число: ");
                imaginary = v.inputY("Введите Мнимую часть второго числа: ");
                ComplexNumber num2_multi = new ComplexNumber(real, imaginary);
                multi.operation(num1_multi, num2_multi);
                System.out.println(multi);
                break;
            case 4:
                Division div = new Division();
                real = v.inputX("Введите первое число: ");
                imaginary = v.inputY("Введите Мнимую часть первого числа: ");
                ComplexNumber num1_div = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите второе число: ");
                imaginary = v.inputY("Введите Мнимую часть второго числа: ");
                ComplexNumber num2_div = new ComplexNumber(real, imaginary);
                div.operation(num1_div, num2_div);
                System.out.println(div);
                break;
        }
    }
}
