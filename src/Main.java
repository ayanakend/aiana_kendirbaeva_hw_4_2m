import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите фразу: ");
            A.add(scanner.nextLine());
            System.out.println("Введенная фраза: " + A.get(i) +"/ A: " + A);
        }
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите фразу: ");
            B.add(scanner.nextLine());
            System.out.println("Введенная фраза: " + B.get(i) +"/ B: " + B);
        }
        ArrayList<String> C = new ArrayList<>();
        int j = 5;
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            j = j - 1;
            C.add(B.get(j));
        }
        System.out.println(C);
        Collections.sort(C, Comparator.comparing(String::length));
        System.out.println(C);
    }
}