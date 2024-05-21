import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randNumber = (int) (1 + Math.random() * 100);
        Scanner reader = new Scanner(System.in);
        int inputNumber;
        int reps = 0;

        System.out.print("Ingrese un numero entre 1 y 100: ");
        inputNumber = reader.nextInt();

        while(inputNumber != randNumber) {
            if(inputNumber < randNumber) {
                System.out.print("El numero ingresado es menor. ");
            } else {
                System.out.print("El numero ingresado es mayor. ");
            }
            System.out.print("Ingrese un nuevo valor: ");
            inputNumber = reader.nextInt();
            reps ++;
        }
        reps ++;
        System.out.println("Ganaste en " + reps + " intentos!");
    }
}