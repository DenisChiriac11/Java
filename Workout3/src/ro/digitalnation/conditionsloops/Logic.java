package ro.digitalnation.conditionsloops;

public class Logic {

	public static boolean ex1(int a, int b,int c) {
		//Exeritiul 1: Scrieti un program Java care citeste de la tastatura 3 numere si verifica daca minim doua dintre ele sunt pozitive (Ex: 2, -4, -7 -> false; 2, 5, 8 -> true)
		int count = 0;
		if (a > 0) count++;
		if (b > 0) count++;
		if (c > 0) count++;
		return count >= 2;
	}
	
	public static int ex2(int a, int b, int c) {
		//Exeritiul 2: Scrieti un program Java ce determina numarul cel mai mare din trei numere citite de la tastatura fara a folosi if case (se vor folosi operatori ternari).
		return a > b ? (Math.max(a, c)) : (Math.max(b, c));

	}
	
	public static int ex3(int a, int b) {
		//Exercitiul 3: Scrieti un program Java ce afiseaza suma valorilor impare dintr-un interval dat (Ex: citit 2, 9 -> se aduna 3, 5, 7, 9, deci rezultatul returnat este 24)
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) sum += i;
		}
		return sum;
	}
	
	public static boolean ex4(int nr) {
		//Exercitiul 4: Scrieti un program Java ce verifica daca un numar este prim sau nu. (Numar Prim = se imparte doar la 1 si la el insusi - ex: 2, 3, 5, 7, 11, 13, 17...)
		//prim number
		if (nr <= 1) return false;
		for (int i = 2; i <= Math.sqrt(nr); i++) {
			if (nr % i == 0) return false;
		}
		return true;
	}
	
	public static boolean ex5(String s) {
		//Exercitiul 5: Scrieti un program Java ce verifica daca un String este palindrom sau nu. (Palindrom = string ce arata la fel citit de la dreapta la stranga, ca si de la stanga la dreapta - ex: ana, cojoc, reper, 123321...)
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) return false;
		}
		return true;
	}
	
	public static int ex6(int n) {
		//Exercitiul 6: Afisati primele N numere din sirul lui Fibonacci (Sirul lui Fibonacci - fiecare numar este egal cu suma numerelor de dinainte - incepand cu 1, 1 -> 1, 1, 2, 3, 5, 8, 13, 21, 34...)
		//Returneaza al N-lea numar
		if (n <= 1) return n;
		int a = 1, b = 1;
		for (int i = 3; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
	
	public static boolean ex7(int n) {
		//Exercitiul 7: Scrieti un program ce verifica dacă un număr natural, introdus de la tastatură, este pefect (egal cu suma divizorilor mai mici ca el; ex: 6=1+2+3)
		if (n <= 1) return false;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) sum += i;
		}
		return sum == n;
	}
	
	public static int ex8(int x) {
		//Exercitiul 8: Sa se determine valoarea functiei de mai jos pentru x (intreg) citit de la tastatura:
		//f(x) = x+10, pentru x <= -5;
				//x * 2, pentru -5 < x <= 10;
				//x^2 + 50, pentru x >10
		return x <= -5 ? x + 10 : (x <= 10 ? x * 2 : x * x + 50);
	}
	
	public static double ex9(String valuta, int valoare) {
		//Exercitiul 9: Realizati un program ce simuleaza un calculator de schimb valutar. Alegeti 5 valute (EUR, USD, GBP, MDL, CAD), setati valoarea de schimb Valuta-RON pentru fiecare (hardcoded in variabile). De la tastatura se va introduce moneda dorita si suma in RON ce se doreste a fi schimbata si se afiseaza valoarea returnata in moneda respectiva (Ex: EUR-1000 -> afiseaza 204).
		//Constrangere: Se va folosi switch case.
		//Folositi drept valori hardcodate urmatoarele: 1 EUR = 4.9 RON; 1 USD = 4.6 RON; 1 GDP = 5.6 RON; 1 MDL = 0.25 RON; 1 CAD = 3.3 RON;
		double rata = 0;
		switch (valuta.toUpperCase()) {
			case "EUR": rata = 4.9; break;
			case "USD": rata = 4.6; break;
			case "GDP": rata = 5.6; break;
			case "MDL": rata = 0.25; break;
			case "CAD": rata = 3.3; break;
			default: return 0;
		}
		return valoare / rata;
	}
	
	public static boolean ex10(String pass) {
		//Exercitiul 10: Se citeste de la tastatura un String. Sa se verifice daca acesta indeplineste constrangerile pentru a fi o parola sigura
		//Parola sigura are lungimea de minim 8, litere lowercase si uppercase, minim o cifra, minim un caracter special (ex: pass - false, XKs4yGC[Sm - true)
		if (pass.length() < 8) return false;
		boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
		for (char c : pass.toCharArray()) {
			if (Character.isLowerCase(c)) hasLower = true;
			else if (Character.isUpperCase(c)) hasUpper = true;
			else if (Character.isDigit(c)) hasDigit = true;
			else hasSpecial = true;
		}
		return hasLower && hasUpper && hasDigit && hasSpecial;
	}
}
