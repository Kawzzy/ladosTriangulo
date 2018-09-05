import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int ladoA,
            ladoB,
            ladoC;

        System.out.print("Enter a value: ");
        ladoA = input.nextInt();

        System.out.print("Enter a value: ");
        ladoB = input.nextInt();

        System.out.print("Enter a value: ");
        ladoC = input.nextInt();

        if(((ladoB - ladoC) < ladoA) && (ladoA < (ladoB + ladoC)) || ((ladoA - ladoC) < ladoB) && (ladoB < (ladoA + ladoC)) || ((ladoA - ladoB) < ladoC) && (ladoC < (ladoA + ladoB))){
            if((ladoA == ladoB) && (ladoA != ladoC) || (ladoA == ladoC) && (ladoA != ladoB) || (ladoB == ladoC) && (ladoB != ladoA)){
                System.out.printf("E um triangulo isosceles, as medidas foram: %d, %d e %d", ladoA, ladoB, ladoC);
            } else if((ladoA != ladoB) && (ladoA != ladoC)){
                System.out.printf("E um triangulo escaleno, as medidas foram: %d, %d e %d", ladoA, ladoB, ladoC);
            } else if((ladoA == ladoB) && (ladoA == ladoC)) {
                System.out.printf("E um triangulo equilatero, as medidas foram: %d, %d e %d", ladoA, ladoB, ladoC);
            } else {
                System.out.printf("Medidas inválidas para a existência de um triangulo!");
            }
        }
    }
}