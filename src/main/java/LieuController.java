import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("lieuController")  // Spécifiez explicitement le nom du bean
@SessionScoped
public class LieuController implements Serializable {

    private static final long serialVersionUID = 1L;  // Il est recommandé de définir un serialVersionUID

    private Lieu lieu = new Lieu();
    private List<Lieu> lieux = new ArrayList<>();

    // Méthode pour ajouter un lieu
    public String ajouterLieu() {
        lieux.add(lieu);
        lieu = new Lieu();  // Réinitialiser l'objet après ajout
        return null;
    }

    // Méthode pour modifier un lieu
    public String modifierLieu(Lieu lieu) {
        this.lieu = lieu;
        return "modifierLieuPage";  // Remplacez par la page de modification
    }

    // Méthode pour supprimer un lieu
    public List<Lieu> supprimerLieu() {
        lieux.remove(lieu);  // Supprimer le lieu de la liste
        return null;
    }

    // Getters et Setters
    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public List<Lieu> getLieux() {
        return lieux;
    }

    public void setLieux(List<Lieu> lieux) {
        this.lieux = lieux;
    }
}
