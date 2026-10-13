import java.util.Scanner;
public class DistributeurDeBillets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int montant;

        System.out.print("Montant à retirer (DH) :");
        montant=sc.nextInt();
        while (montant % 10 != 0 | montant < 10 | montant > 5000){
            System.out.println("Montant Invalid ! (multiple de 10 , entre 10 et 5k)");
            System.out.print("Montant à retirer (DH) : ");
            montant=sc.nextInt();
        }
        int montant_msg=montant;
        int diviseur=200;
        int nbPiece=0,totalBillet=0;
        int nbBillet=0;
        System.out.println("Vous recevez "+montant_msg+" :");
        while (montant !=0){
            nbBillet=montant / diviseur;
            totalBillet+=nbBillet;
            montant=montant % diviseur;
            if (nbBillet!=0) {
                if (diviseur == 10) {
                    System.out.println(nbBillet + " piece(s) de " + diviseur + " DH");
                    nbPiece=nbBillet;
                    totalBillet--;
                }
                else {
                    System.out.println(nbBillet + " billet(s) de " + diviseur + " DH");
                }
            }
            if (diviseur == 50) diviseur = 40;
            diviseur=diviseur/2;
        }
        System.out.println("Total : " +totalBillet + " billets (s) et "+ nbPiece + " piece(s)");
    }
}
