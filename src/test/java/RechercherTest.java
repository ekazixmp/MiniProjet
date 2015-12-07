

import org.junit.Test;

public class RechercherTest {

	@Test
	public void testRecherche() {
		Rechercher B= new Rechercher();
	         Object[] iArr = {"coco","sisi","jubo","nino"};
	         B.recherche(iArr, "sisi");
	}

}

