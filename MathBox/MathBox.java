import java.util.Scanner;
public class MathBox {

    public static void main(String[] args) {
        System.out.println("Bonjour !\n Voici notre menu des outiles mathematiques : ");
        Scanner scanner = new Scanner(System.in);
        int choix = -1;
        while (choix != 0) {
            System.out.println("1. Table de multiplication");
            System.out.println("2. Factorielle");
            System.out.println("3. Nombre premier ?");
            System.out.println("4. Somme des chiffres");
            System.out.println("5. Triangle d'Etoiles");
            System.out.println("0. Quitter");
            System.out.print("Ton choix : ");
            choix = scanner.nextInt();

            if (choix == 1) {
                System.out.println(" Veillez taper votre nombre : ");
                int nombre = scanner.nextInt();
                for ( int i= 1 ; i <= 10 ; i++){
                    System.out.println( nombre + "x" + i + " = " + (nombre*i));
                }
            }
              else if (choix == 2)   {
                System.out.println(" Veillez taper votre nombre : ");
                int nombre = scanner.nextInt();
                long resultat = 1;
                for (int i =2 ; i<= nombre ; i++){
                    resultat = resultat * i;
                }
                System.out.println(nombre + "! = " + resultat);
              }
              else if (choix == 3)   {
                System.out.println(" Veillez taper votre nombre : ");
                int nombre = scanner.nextInt();
                Boolean premier = true;
                if (nombre<2){
                    premier = false ;
                }
                 for (int i =2 ; i*i<= nombre; i++){
                    if (nombre % i == 0)  {
                        premier = false;
                  }
                
               }
               if (premier) {
                    System.out.println(nombre + " est premier.");
                } else {
                    System.out.println(nombre + " n'est pas premier.");
                }
              }
              else if (choix == 4) {
                System.out.print("Nombre : ");
                int n = scanner.nextInt();
                int somme = 0;
                while (n > 0) {
                    somme = somme + n % 10;
                    n = n / 10;
                }
                System.out.println("Somme des chiffres : " + somme);

            } else if (choix == 5) {
                System.out.print("Hauteur : ");
                int n = scanner.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else if (choix == 0) {
                System.out.println("Au revoir !");

            } else {
                System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }
                 



    }

