import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(imie()+ " lat " + wiek());
        System.out.println("Podaj a: ");
        int a = inputInt();
        System.out.println("Podaj b: ");
        int b = inputInt();
        zadanie2(a,b);
        System.out.println("Podaj c: ");
        int c = inputInt();
        System.out.println(oddControl(c));
        System.out.println("Podaj d: ");
        int d = inputInt();
        System.out.println(zadanie4(d));
        System.out.println("Podaj e: ");
        int e = inputInt();
        System.out.println(powerOfThree(e));
        System.out.println("Podaj f: ");
        int f = inputInt();
        System.out.println(sqareRoot(f));
        System.out.println("Podaj poczatek przedzialu (g): ");
        int g = inputInt();
        System.out.println("Podaj koniec przedzialu (h): ");
        int h = inputInt();
        System.out.println(triangleCheck(random(g,h),random(g,h),random(g,h)));

    }//koniec main
    public static String imie(){
        return "Mateusz";
    }
    public static int wiek(){
        return 21;
    }
    public static void zadanie2(int a, int b){
        System.out.println("Suma: "+ a+" + "+b+" = "+ (a+b));
        System.out.println("Różnica: "+ a+" - "+b+" = "+ (a-b));
        System.out.println("Iloczyn: "+ a+" * "+b+" = "+ (a*b));
    }

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static boolean oddControl(int c){
        if (c%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }//kontrola parzystości (zadanie 3)
    public static boolean zadanie4(int d) {
        if (d%3 == 0 && d%5 ==0)
            return true;
        else{
            return false;
        }
    }//czy liczba podzielna przez 3 i 5 (zadanie 4)

    public static double powerOfThree(double e){
        return Math.pow(e,3);
    }// zadanie 5

    public static double sqareRoot(double f){
        return Math.sqrt(f);
    }// zadanie 6

    public static int random(int g, int h){
        Random random = new Random();
        int randomized = random.nextInt(h-g+1)+g;
        return randomized;
    }
    public static boolean triangleCheck(int a, int b, int c){
        if ((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (b*b)+(c*c)==(a*a))
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            return true;
        }
        else{
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            return false;
        }
    }
}//koniec klasy