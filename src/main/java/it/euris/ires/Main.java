package it.euris.ires;

public class Main {
    public static void main(String[] args) {
        //test con numeri interi positivi:
        int a = 35;
        int b = 2;
    Calculator calc = new Calculator(); //precondizione
    int result = calc.add(a,b); //add() =SUT
    if (result == 37){ //postcondizione
        System.out.println("Valore ok");
    }
    }
}
