package com.mycompany.mavenproject2;
import java.util.Scanner;
class Task4 {
    int i = 1;
    int product = 1;
    int number = 0;
    public void input(){
        System.out.print("Enter an integar : ");
        Scanner input = new Scanner(System.in);
         number = input.nextInt();
    }
    public int computeProduct() {
        if (number != 0) {
            if (i <= number) {
                product = product * i;
                i = i + 1;
                computeProduct();
            }
        }
        return product;
    }
}
