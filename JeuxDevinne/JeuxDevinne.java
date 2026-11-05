import java.util.Scanner;

public class JeuxDevinne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nombre = (int)(Math.random() * 100);
        int tentatives = 1;
       
        System.out.println("veuillez ecrire un nombre : ");
       
        int nombreCandidat = scanner.nextInt();
        
        
        while ( nombre != nombreCandidat ) {
            System.out.println("Pardon votre nombre n'est pas correct");

            if (nombreCandidat>nombre){

                System.out.println("votre nombre est très grand ");
                
            }
                else
                    System.out.println("votre nombre est très petit ");
                nombreCandidat = scanner.nextInt();
                tentatives ++;
        }
        
        System.out.println(" Tres bien vous avez bien choisie le nombre ");
        
        System.out.println("votre nombre de tentatives est " + tentatives);
        
        scanner.close();
    }
}