package services;

import models.BoursierLoge;
import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceTableau implements IService {
    private final int TAILLE = 10;
    private Pavillon[] pavillons = new Pavillon[TAILLE];
    private int indexPavillon;
      private final int NOMBRE = 10;
    private Chambre[] chambres = new Chambre[NOMBRE];
    private int indexChambre;
    
    @Override
    public void addPavillon(Pavillon pavillon) {
        if (indexPavillon < TAILLE) {
            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
            
        } else {
            System.out.println("le tableau est plein");
        }
        
        
    }

    @Override
    public void suppPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon p : pavillons) 
        {
            if (p!=null){
                System.out.println(p);
            }
        }
        
    }

    @Override
    public void listerChambreDunPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }
    
  
    @Override
    public void addChambre(Chambre chambre) {
        if(indexChambre < NOMBRE){
            chambres[indexChambre] = chambre;
            indexChambre++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
        
    }

    @Override
    public void listerChambre() {
         for (Chambre c : chambres) {
            if(c != null){
                System.out.println(c);
            }
        }
        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerEtudiantChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambreBoursierLoge(Chambre chambre, BoursierLoge boursierLoge) {
        // TODO Auto-generated method stub
        
    }
    
}
