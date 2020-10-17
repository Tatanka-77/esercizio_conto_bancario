public class Client {
	public static void main (String args[]) {
		Conto conto1 = new Conto(args[0], args[1], Double.parseDouble(args[2]));
		System.out.println ("Hai aperto il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", con un saldo di: " + conto1.getSaldo());
		Conto conto2 = new Conto(args[3], args[4]);
		System.out.println ("Hai aperto il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", con un saldo di: " + conto2.getSaldo());
		System.out.println ("Stiamo prelevando " + args[5] + " dal conto di " + conto1.getCorrentista());
		String risposta = "L'operazione è ";
		System.out.println (risposta + (conto1.preleva(Double.parseDouble(args[5])) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
                System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		System.out.println ("Stiamo trasferendo " + args[6] + " dal conto di " + conto1.getCorrentista() + " al conto di " + conto2.getCorrentista());
		System.out.println (risposta + (conto1.trasferisci(Double.parseDouble(args[6]), conto2) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
		System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		System.out.println ("Stiamo trasferendo " + args[7] + " dal conto di " + conto1.getCorrentista() + " al conto di " + conto2.getCorrentista());
		System.out.println (risposta + (conto1.trasferisci(Double.parseDouble(args[7]), conto2) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
		System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		System.out.println ("Adesso preleviamo " + args[8] + " dal conto di " + conto2.getCorrentista());
	        System.out.println (risposta + (conto2.preleva(Double.parseDouble(args[8])) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
	        System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		Conto conto3 = new Conto(args[9], args[10] ,Double.parseDouble(args[11]));
		System.out.println ("Infine apriamo il conto numero: " + conto3.getCodice() + ", intestato a: " + conto3.getCorrentista() + ", con un saldo di: " + conto3.getSaldo());
		System.out.println ("Adesso apriamo un conto in modalità interattiva:");
		Conto conto4 = new Conto();
		System.out.println ("Il conto numero: " + conto4.getCodice() + ", intestato a: " + conto4.getCorrentista() + ", ha un saldo di: " + conto4.getSaldo());
	}
}
