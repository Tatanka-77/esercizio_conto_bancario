import java.util.*;
/** Classe che modella un semplice conto bancario */
public class Conto {
	static private int progressivo = 1;
	final private int codiceConto;
	final private String nome;
	final private String cognome;
	private double saldo;

	/** Metodo statico per richiedere il nome del correntista all'utente
	 * @return String - Nome del correntista */
	private static String acquisisciNome() {
		Scanner datiInseriti = new Scanner(System.in);
		System.out.print ("Inserisci il nome del correntista -> ");
		return datiInseriti.nextLine();
	}
	
	/** Metodo statico per richiedere il cognome del correntista all'utente
         * @return String - Cognome del correntista */
        private static String acquisisciCognome() {
                Scanner datiInseriti = new Scanner(System.in);
                System.out.print ("Inserisci il cognome del correntista -> ");
                return datiInseriti.nextLine();
	}
	
	/** Metodo statico per richiedere il saldo iniziale all'utente
         * @return double saldo iniziale */
        private static double acquisisciSaldo() {
                Scanner datiInseriti = new Scanner(System.in);
                System.out.print ("Inserisci il saldo iniziale -> ");
                return datiInseriti.nextDouble();
	}


	/** Istanzia un conto con nome cognome e saldo iniziale ricevuti come parametro
	 * @param nome String nome dell'intestatario del conto
	 * @param cognome String cognome dell'intestatario del conto
	 * @param saldo double saldo iniziale */
	public Conto (String nome, String cognome, double saldo) {
		this.codiceConto = progressivo++;
		this.nome = nome.substring(0,1).toUpperCase() + nome.substring(1,nome.length()).toLowerCase();
		this.cognome = cognome.substring(0,1).toUpperCase() + cognome.substring(1,cognome.length()).toLowerCase(); //memorizzo nomi e cognomi con iniziale maiuscola e resto minuscolo
		this.saldo = saldo;
		}

	/** Istanzia un conto ricevendo come parametro solo il nome ed il cognome  impostando il saldo a zero
	 * @param nome String intestatario del conto */
	public Conto (String nome, String cognome) {
		this(nome, cognome, 0);
	}

	/** Istanzia un conto richiedendo i parametri dalla console */
	public Conto () {
		this(acquisisciNome(), acquisisciCognome(), acquisisciSaldo());
	}


	/** Restituisce il codice del conto 
	 * @return int codice del conto */
	public int getCodice() {
		return this.codiceConto;
	}

	/** Restituisce l'intestatario del conto
	 * @return String Nome del correntista */
	public String getCorrentista() {
		return this.nome + " " + this.cognome;
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
