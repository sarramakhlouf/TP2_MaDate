import java.util.Scanner;
public class Test_MaDate
{
    public static void main (String [] args)
    {
        MaDate d1;
        MaDate d2;
        MaDate d3;
        d1=new MaDate(28,11,2003);
        d2=new MaDate(20,6,1968);
        d3=new MaDate(2024);
        System.out.println("modification des attributs") ;
        d1.Setjour(29);
        /*d2.Setmois(3);*/
        d3.Setannee(1996);
        System.out.println("date 1:"+d1.ToString());
        System.out.println("date 2:"+d2.ToString());
        System.out.println("date 3:"+d3.ToString());
        Scanner S=new Scanner(System.in);
        boolean changer=true;
        while(changer)
        {
           System.out.println("choisir une option");
           System.out.println("1:ajouter un jour");
           System.out.println("2:ajouter un mois");
           System.out.println("3:ajouter une annee");
           System.out.println("4:ajouter plusieurs jours");
           System.out.println("5:quitter");
           int choix =S.nextInt();
            switch (choix)
            {
                case 1:
                    d1.ajouterUnJour();
                    System.out.println("date 1 apres l'ajout d'un jour" +d1.ToString());
                    break;
                case 2:
                    System.out.println("combien des jours à ajouter?");
                    int nbJ=S.nextInt();
                    d1.ajouterPlusieursJours(nbJ);
                    System.out.println("date 1 apres l'ajout des plusieurs jours" +d1.ToString());
                    break;
                case 3:
                    d1.ajouterUnMois();
                    System.out.println("date 1 apres l'ajout d'un mois" +d1.ToString());
                    break;
                case 4:
                    d1.ajouterUnAn();
                    System.out.println("date 1 apres l'ajout d'une annee" +d1.ToString());
                    break;
                case 5:
                    changer=false;
                    System.out.println("au revoir");
                    break;
                default:
                    System.out.println("le choix est invalide");
            }
        }
        S.close();
    }   
}
