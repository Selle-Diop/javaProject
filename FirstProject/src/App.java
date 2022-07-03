import java.util.Scanner;

import models.Chambre;
import models.Pavillon;
import models.TypeChambre;
import services.IService;
import services.ServiceTableau;

public class App {
    public static void main(String[] args) throws Exception {
        IService service = new ServiceTableau();
        Chambre chambre = new Chambre();
        Pavillon pavillon = new Pavillon();

        System.out.println("");
        System.out.println("Bienvenue a l'universite");
        System.out.println("1:Ajouter Pavillon");
        System.out.println("2:Lister Pavillon");
        System.out.println("3:Ajouter Chambre");
        System.out.println("4:Lister Chambre");
        System.out.println("5:Quitter");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faite votre Choix");
        int nombre = scanner.nextInt();
        switch (nombre) {
            case 1:
                System.out.println("veuillez saisir le numero de pavillon");
                int numPavi = scanner.nextInt();
                pavillon.setNumPav(numPavi);
                System.out.println("veuillez saisir le nombre etage");
                int numEta = scanner.nextInt();
                pavillon.setNombreEtage(numEta); 
               service.addPavillon(pavillon);
               service.listerPavillon();
                
               break;
           case 3:
           System.out.println("veuillez saisir le numero d'etage");
           String numEtage = scanner.nextLine();
                chambre.setNumEtage(numEtage);
            System.out.println("veuillez saisir le numero de Chambre");
           String numChambre = scanner.nextLine();;
           chambre.setNumEtage(numChambre);
           System.out.println("veuillez saisir le Type de Chambre (INDIVIDUEL/DOUBLE");
           String typeC = scanner.nextLine();
                chambre.setPavillon(pavillon);
           service.addChambre(chambre);
        service.listerChambre();
              
                
                break;
            default:
                break;
        }
        
        // pavillon.setId(1);
       
        // chambre.setId(1);
        // chambre.setNumEtage("2");
        // chambre.setNumChambre("ch001");
        // chambre.setTypeChambre(TypeChambre.DOUBLE);
        // chambre.setPavillon(pavillon);
        // service.addChambre(chambre);
        // service.listerChambre();





    }
}
