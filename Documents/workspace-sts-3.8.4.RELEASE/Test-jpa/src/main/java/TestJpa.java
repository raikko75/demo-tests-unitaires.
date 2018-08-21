import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Emprunt;
import model.Livre;
import services.DaoPizza;
import services.IDaoPizza;

public class TestJpa {

	
	public TestJpa(){
		
	}
	
	public static void main(String[] args) {
		EntityManagerFactory entityFactory = new Persistence().createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityFactory.createEntityManager();
		IDaoPizza idao = new DaoPizza(entityManager);
		
		Livre l = idao.find(1);
		//System.out.println( l.getTitre());
	
		Emprunt e = new Emprunt();
		//System.out.println(idao.searchEmprunt(1).getLivre().get(0).getTitre());
		System.out.println(idao.searchEmpruntToClient("YU").getEmprunt().getClass().getName());

	}
	


}
