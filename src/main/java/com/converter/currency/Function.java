package com.converter.currency;

import javax.swing.*;

public class Function {

    public boolean check(String input){
        try{
            double x = Double.parseDouble(input);
            if(x>=0 || x<0);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public void zlotyToDollar(double fixInput){
        double dol = fixInput * 3.81;
        JOptionPane.showMessageDialog(null, "Amount of USD "+dol);
    }

    public void zlotyToEuro(double fixInput){
        double euro = fixInput * 4.32;
        JOptionPane.showMessageDialog(null, "Amount of EUR "+euro);
    }
}
