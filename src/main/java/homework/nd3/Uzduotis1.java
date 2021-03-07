package homework.nd3;

public class Uzduotis1 {
//1.	Implement the program which will be displaying on the standard output (screen) the character
// sequence as below:
//*
//**
//***
//****
//*****
//We want to receive as many rows as the value assigned to the variable n at the beginning of the program.

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) { // outer loop for number of rows(n)
            for(int j=0; j <= i; j++) { // inner loop for columns
                System.out.print("*"); // print star
            }
            System.out.println(); //ending line after each row
        }
    }
}
