import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("lieuController")  // Utiliser @Named au lieu de @ManagedBean
@ViewScoped  // Portée du bean (ViewScoped est recommandé pour la persistance des données)
public class LieuController implements Serializable {
    private Lieu lieu = new Lieu();
    private List<Lieu> lieux = new ArrayList<>();

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public List<Lieu> getLieux() {
        return lieux;
    }

    public void ajouterLieu() {
        lieux.add(lieu);
        lieu = new Lieu();  // Réinitialisation après ajout
    }
}
