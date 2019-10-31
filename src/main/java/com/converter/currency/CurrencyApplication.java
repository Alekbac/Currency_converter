package com.converter.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class CurrencyApplication {

    public static void main(String[] args) {
        //SpringApplication.run(CurrencyApplication.class, args);

        Function function = new Function();

        while(true){
            String input = JOptionPane.showInputDialog(null, "Enter value: ");
            System.out.println(input);

            if(function.check(input) == true){
                double fixInput = Double.parseDouble(input);

                function.zlotyToDollar(fixInput);
                function.zlotyToEuro(fixInput);
                break;
            }else {
                JOptionPane.showMessageDialog(null, "Invalid output");
            }
        }

    }

}
