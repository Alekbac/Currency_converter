package com.converter.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class CurrencyApplication {

    public static void main(String[] args) {
        Function function = new Function();
        Object[] option1 = {"USD", "EUR","Cancel"};
        Object[] option2 = {"Try again", "Cancel"};

        while(true){
            String input = JOptionPane.showInputDialog(null, "Enter value: ");
            System.out.println(input);

            if(function.check(input) == true){
                double fixInput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null,"Choose witch currency You want to convert",
                        "Currency converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, option1, option1[2]);

                if(choice1 == 0){
                    function.zlotyToDollar(fixInput);
                    break;
                }else if(choice1 == 1){
                    function.zlotyToEuro(fixInput);
                    break;
                }else {
                    break;
                }

            }else {
                JOptionPane.showMessageDialog(null, "Invalid output");

                int choice2 = JOptionPane.showOptionDialog(null,"What do You wish to do?",
                        "Currency converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, option2, option2[1]);

                if(choice2 == 0){

                }else {
                    break;
                }
            }
        }
    }

}
