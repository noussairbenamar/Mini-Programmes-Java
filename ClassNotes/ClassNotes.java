import java.util.Scanner;

public class ClassNotes {

    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);{
            System.out.print("combien vous avez des etudiants dans la class ?  : " );
            
            int NombreEtudiants = scanner.nextInt();
            double[] Notes = new double[NombreEtudiants];
            
            System.out.println(" Veuillez entrez les notes sur 20 : ");
            for ( int i = 0 ; i < NombreEtudiants ; i++ ){
                System.out.print(" la note d'etudiant " + (i + 1) + " :  " );
                 Notes[i] = scanner.nextDouble();
            }  
            double somme = 0;
            for ( int i = 0 ; i < Notes.length ;i++ ) {
                somme = somme + Notes[i];
            }
            double moyenne = (somme/NombreEtudiants);
            System.out.println("La moyenne de votre class est  :  " + moyenne );
            
            double noteMax = 0 ;
            double noteMin = 20 ;

            for ( int i = 0 ; i < NombreEtudiants ; i++){
                if (noteMax < Notes[i] ){
                    noteMax = Notes[i];
                }
                if (noteMin > Notes[i]){
                    noteMin = Notes[i];
                }
            }
            System.out.println("la note maximal est : " + noteMax);
            System.out.println("la note minimal est : " + noteMin);
            System.out.println("au revoir :) ");




         scanner.close();
    }
    
  }

}