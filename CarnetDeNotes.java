import java.util.Scanner;
public class CarnetDeNotes {
    public static void main(String[] args) {
         double note;
         byte nbNotes;
         double mean;
         double sumNotes=0;
         double max=0,min=0;
         Scanner sc = new Scanner(System.in);
         System.out.print("Nombre de notes: ");
         nbNotes = sc.nextByte();
         for (int i=0;i<nbNotes;i++)
         {
             System.out.print("Note " + (i+1) + " : ");
             note = sc.nextDouble();
             while ((note < 0) | (note > 20)){
                 System.out.println("Note Invalid (0 a 20)!");
                 System.out.print("Note " + (i+1) + " : ");
                 note = sc.nextDouble();
             }
             for (int j=0;j<note;j++){
                 System.out.print("*");
             }
             System.out.println("\n");
             sumNotes += note;
             if (max==0 & min==0)
             {
                 min=note;
             }
             if (max < note) max=note;
             if (min > note) min=note;
         }
         mean=(sumNotes/nbNotes);

        System.out.println("Nombre de notes : "+nbNotes);
        System.out.println("Moyenne : "+mean);
        System.out.println("Meilleure note : "+max);
        System.out.println("Plus Faible : "+min);
        if (mean < 10) System.out.println("Mention : Insuffisant");
        else if (mean <12) System.out.println("Mention : Passable");
        else if (mean <14) System.out.println("Mention : Assez bien");
        else if (mean < 16) System.out.println("Mention :  Bien");
        else System.out.println("Mention :  Excellent");
    }
}
