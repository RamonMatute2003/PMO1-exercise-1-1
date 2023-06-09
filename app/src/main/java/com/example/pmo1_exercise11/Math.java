package com.example.pmo1_exercise11;

import android.widget.Toast;

public class Math{
    private static String result;//result=resultado

    public Math(Double number1, Double number2, Integer button){
        switch(button){
            case 1:
                result="La suma es: "+(String.format("%.2f",(number1+number2)));
            break;
            case 2:
                result="La resta es: "+(String.format("%.2f",(number1-number2)));
            break;
            case 3:
                result ="La division es: "+(String.format("%.2f",(number1/number2)));
            break;
            case 4:
                result="la multiplicacion es: "+(String.format("%.2f",(number1*number2)));
            break;
        }
    }

    public Math(){

    }

    public String show_result(){//show_result=mostrar resultado
        return result;
    }
}
