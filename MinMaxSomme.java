import java.util.Scanner;
public class MinMaxSomme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=0, max=0, somme = 0;
        int v;
        boolean show_message=false;
        String message="Aucune Valeur Saise !";
        do {
            System.out.print("Valeur (0 pour arrêter) : ");
            v = sc.nextInt();
            if (v==0) break;
            if ((min == 0) & (max==0)) {
                show_message = true;
                min=v;
                max=v;
            }
            else {
                if (v > max ) max = v;
                if (v < min ) min = v;
                somme += v;
                show_message = false;
            }
        } while (v != 0);
        if (show_message) System.out.println(message);
        else {
            System.out.println("Max = " + max + ", Min = " + min);
            System.out.println("Somme = " + somme);
        }
    }
}