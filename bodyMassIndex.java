import java.util.Scanner;
public class bodyMassIndex {
public static void main(String []args){
double kg;
double height;
double index;
Scanner scanner= new Scanner(System.in);
System.out.println("Please enter your height (in meters):");
height= scanner.nextDouble();
System.out.println("Please enter your weight:");
kg= scanner.nextDouble();
index= kg/(height*height);
System.out.println("Your Body Mass Index:" + index);
}
}