package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import basic.Persoana;

class TestArrays {

	@Test
	void testArrays() {
		String[] prenume = null;
		assertNull(null, prenume);

		prenume = new String[5];
		assertNotNull(prenume);

		prenume[0] = "Laura";
		prenume[1] = "Ion";
		prenume[2] = "Marius";
		prenume[3] = "Ioana";
		prenume[4] = "Andrei";
		assertEquals(5, prenume.length);
		assertTrue(prenume[4].length() != 0);

		String[] nume = new String[5];
		assertNotNull(nume);
		nume[0] = "Ionescu";
		nume[1] = "Popescu";
		nume[2] = "Marin";
		nume[3] = "Savu";
		nume[4] = "Lazar";
		assertEquals(5, nume.length);
		assertTrue(nume[4].length() != 0);

		Integer[] varste = new Integer[] {40, 30, 25, 31, 19};
		assertNotNull(varste);
		assertEquals(5, varste.length);
		assertTrue(varste[4] > 0);

		//Definiti cel putin o valoare true si una false in cadrul array-ului
		boolean[] stareCivila = new boolean[] {false, true, true, false, false};
		assertNotNull(stareCivila);
		assertEquals(5, stareCivila.length);
		assertTrue(stareCivila[0] || stareCivila[1] || stareCivila[2] || stareCivila[3] || stareCivila[4]);
		assertFalse(stareCivila[0] && stareCivila[1] && stareCivila[2] && stareCivila[3] && stareCivila[4]);

		Persoana.curs = "JAVA";
		assertEquals("JAVA", Persoana.curs);
		ArrayList<Persoana> persoane = null;
		assertNull(persoane);
		persoane = new ArrayList<Persoana>(5);
		assertNotNull(persoane);
		assertEquals(0, persoane.size());
		//si a crea folosind valorile de pe fiecare pozitie o noua instanta de tip persoana
		//care sa fie apoi adaugata in ArrayList-ul "persoane"
		//Rezultatul final ar trebui sa fie un ArrayList cu 5 instante de tip Persoana
		//prima avand nume, prenume, oras, varsta, stareCivila ce corespunde cu pozitia 0, al doilea cu pozitia 1 samd

		for (int i = 0; i < 5; i++) {
			Persoana p = new Persoana(nume[i], prenume[i], varste[i], stareCivila[i]);
			persoane.add(p);
		}
		assertEquals(5, persoane.size());

		System.out.println(persoane);
		assertEquals(nume[0], persoane.get(0).getNume());
		assertEquals(prenume[1], persoane.get(1).getPrenume());
		assertEquals(varste[2], persoane.get(2).getVarsta());
		assertEquals(stareCivila[3], persoane.get(3).isCasatorita());


		for (Persoana p: persoane) {
			System.out.println(p);
		}

		//Vom realiza o structura de date ce contine notele elevilor bazata pe o cheie reprezentata de identificatorul persoanei
		Map<String, Integer> catalog = new HashMap<String, Integer>();
		assertNotNull(catalog);

		//metoda obtineIdentificator() drept cheie si o nota intre 1 si 10 drept valoare (minim o nota sub 5)
		//Hint: obtineti persoana din lista folosind pozitia acesteia, nu parcurgeti lista intr-o bucla
		catalog.put(persoane.get(0).obtineIdentificator(), 2);
		catalog.put(persoane.get(1).obtineIdentificator(), 7);
		catalog.put(persoane.get(2).obtineIdentificator(), 9);
		catalog.put(persoane.get(3).obtineIdentificator(), 4);
		catalog.put(persoane.get(4).obtineIdentificator(), 3);
		assertTrue(catalog.get(persoane.get(0).obtineIdentificator()) >= 1 && catalog.get(persoane.get(0).obtineIdentificator()) <= 10);

		System.out.println(catalog);

		//cu formatarea "Studentul ID are nota NOTA" - ex: "Studentul ion_POPESCU are nota 7"
		for(String id : catalog.keySet()) {
			System.out.println("Studentul " + id + " are nota " + catalog.get(id));
		}

		System.out.println(persoane.size());
		System.out.println(catalog.size());
		//Pentru aceasta se va verifica valoarea notei pentru fiecare persoana din "catalog"
		//Daca se elimina o persoana din lista se va elimina si intrarea legata de aceasta din catalog
		//HINT: ordinea stergerilor conteaza
		for (int i = 0; i < persoane.size(); i++) {
			if (catalog.get(persoane.get(i).obtineIdentificator()) < 5) {
				catalog.remove(persoane.get(i).obtineIdentificator());
				persoane.remove(i);
				i--;
			}
		}
		for(String id : catalog.keySet()) {
			assertNotNull(catalog.get(id));
		}

		for(String id : catalog.keySet()) {
			assertTrue(catalog.get(id) > 5);
		}
		System.out.println(persoane.size());
		System.out.println(catalog.size());
		assertEquals(catalog.size(), persoane.size());
		System.out.println(persoane);
		System.out.println(catalog);


	}



}
