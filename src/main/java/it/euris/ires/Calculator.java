package it.euris.ires;

public class Calculator {

	//ADDITION
	public int add(int a, int b) {
		return a + b;
	}

	//SUBSTRACTION
	public int sub(int a, int b){
		return a - b;
	}

	//MULTIPLICATION
	public int multiplication(int a, int b){
		return a*b;
	}

	//DIVISION WITHOUT DECIMAL
	public int division(int a, int b) throws Exception{
		if (b == 0) {
			throw new Exception("b can't be 0");
		}
		return a / b;
	}

	public static void main(String[] args) throws Exception {
		Calculator c = new Calculator();
		System.out.println(c.division(10, 7));
	}
}
