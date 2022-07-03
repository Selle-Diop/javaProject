package services;

import models.BoursierLoge;
import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public interface IService {
    public void addPavillon(Pavillon pavillon);
    public void suppPavillon(Pavillon pavillon);

    public void listerPavillon();

    public void listerChambreDunPavillon(Pavillon pavillon);

    public void addChambre(Chambre chambre);

    public void listerChambre();

    public void archiverChambre(Chambre chambre);

    public void addEtudiant(Etudiant etudiant);

    public void listerEtudiantChambre(Chambre chambre);

    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon);
    public void affecterChambreBoursierLoge(Chambre chambre,BoursierLoge boursierLoge);
    

     
    
    
    

    

    

    
    
    
    
    

    
}
