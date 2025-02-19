
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

@Named(value = "navigationController")
@RequestScoped
        
public class NavigationBean {
    
    public void voirApropos(){
        try{
            FacesContext.getCurrentInstance().getExternalContext()
                .redirect("a_propos.xhtml");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void ajouter(){
        try{
            FacesContext.getCurrentInstance().getExternalContext()
                .redirect("ajouter.xhtml");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void visiter(){
        try{
            FacesContext.getCurrentInstance().getExternalContext()
                .redirect("visiter.xhtml");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
