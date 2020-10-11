/** Classe che modella un semplice conto bancario */
public class Conto {
	static private int progressivo = 1;
	private int codiceConto;
	private String nome;
	private double saldo;

	/** Istanzia un conto con nome e saldo ricevuti come parametro
	 * @param nome String intestatario del conto
	 * @param saldo double saldo iniziale */
	public Conto (String nome, double saldo) {
		this.codiceConto = progressivo++;
		this.nome = nome.substring(0,1).toUpperCase() + nome.substring(1,nome.length()).toLowerCase();
		this.saldo = saldo;
		}

	/** Istanzia un conto ricevendo come parametro solo il nome ed impostando il saldo a zero
	 * @param nome String intestatario del conto */
	public Conto (String nome) {
		this(nome,0);
	}

	/** Restituisce il codice del conto 
	 * @return int codice del conto */
	public int getCodice() {
		return this.codiceConto;
	}

	/** Restituisce l'intestatario del conto
	 * @return String Nome del correntista */
	public String getCorrentista() {
		return this.nome;
	}

	/** Restituisce il saldo del conto
	 * @return double Saldo del conto */
	public double getSaldo() {
		return this.saldo;
	}

	/** Preleva, se il conto è in attivo, la cifra richiesta
	 * @param importo double cifra da prelevare 
	 * @return boolean ritorna vero se il prelievo è stato effettuato */
	public boolean preleva(double importo) {
		if (this.saldo <= 0) return false;
		else this.saldo-=importo;
		return true;
	}

	/** Versa l'importo ricevuto in ingresso sul conto
	 * @param importo double importo da versare sul conto */
	public void versa(double importo) {
		this.saldo+=importo;
	}

	/** Trasferisce l'importo dal conto ad un altro conto
	 * @param importo double Importo da trasferire
	 * @param destinazione Conto Conto di destinazione 
	 * @return boolean Ritorna vero se il trasferimento è stato eseguito */
	public boolean trasferisci(double importo, Conto destinazione) {
		if (this.preleva(importo)) {
			destinazione.saldo+=importo;
			return true;
		}
		else return false;
	}
}
