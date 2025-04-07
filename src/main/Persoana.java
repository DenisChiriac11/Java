package main;

public class Persoana {
	// Step 6: Define properties
	private String nume;
	private String prenume;
	private String oras;
	private int varsta;
	private boolean casatorita;

	//17
	public static String curs;

	//8
	public Persoana(String nume, String prenume, String oras, int varsta, boolean casatorita) {
		this.nume = nume;
		this.prenume = prenume;
		this.oras = oras;
		this.varsta = varsta;
		this.casatorita = casatorita;
	}

	//14
	public Persoana() {
	}

	//9
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public boolean isCasatorita() {
		return casatorita;
	}

	public void setCasatorita(boolean casatorita) {
		this.casatorita = casatorita;
	}

	//12 & 18
	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", prenume=" + prenume + ", oras=" + oras +
				", varsta=" + varsta + ", casatorita=" + casatorita + ", curs=" + curs + "]";
	}

	//22
	public void creste() {
		this.varsta += 1;
	}

	//24 & 25
	public String obtineIdentificator() {
		String processedPrenume = prenume.trim().toLowerCase().replaceAll("-", "").replaceAll(" ", "");
		String processedNume = nume.trim().toUpperCase();
		return processedPrenume + "_" + processedNume;
	}
}
