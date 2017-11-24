package fiap.scj.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
/*@RequestScoped
@ApplicationScoped*/

public class BemVindoMBean {
	private String boasVindas = "Funfo";
	
	public String getBoasVindas(){
		return boasVindas;
	}

}
