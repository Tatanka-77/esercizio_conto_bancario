public class Client {
	public static void main (String args[]) {
		Conto conto1 = new Conto(args[0], Double.parseDouble(args[1]));
		System.out.println ("Hai aperto il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", con un saldo di: " + conto1.getSaldo());
		Conto conto2 = new Conto(args[2]);
		System.out.println ("Hai aperto il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", con un saldo di: " + conto2.getSaldo());
		System.out.println ("Stiamo prelevando " + args[3] + " dal conto di " + conto1.getCorrentista());
		String risposta = "L'operazione è ";
		System.out.println (risposta + (conto1.preleva(Double.parseDouble(args[3])) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
                System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		System.out.println ("Stiamo trasferendo " + args[4] + " dal conto di " + conto1.getCorrentista() + " al conto di " + conto2.getCorrentista());
		System.out.println (risposta + (conto1.trasferisci(Double.parseDouble(args[4]), conto2) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
		System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		System.out.println ("Stiamo trasferendo " + args[5] + " dal conto di " + conto1.getCorrentista() + " al conto di " + conto2.getCorrentista());
		System.out.println (risposta + (conto1.trasferisci(Double.parseDouble(args[5]), conto2) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
		System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		System.out.println ("Adesso preleviamo " + args[6] + " dal conto di " + conto2.getCorrentista());
	        System.out.println (risposta + (conto2.preleva(Double.parseDouble(args[6])) ? "riuscita" : "fallita"));
		System.out.println ("Il conto numero: " + conto1.getCodice() + ", intestato a: " + conto1.getCorrentista() + ", ha un saldo di: " + conto1.getSaldo());
	        System.out.println ("Il conto numero: " + conto2.getCodice() + ", intestato a: " + conto2.getCorrentista() + ", ha un saldo di: " + conto2.getSaldo());
		Conto conto3 = new Conto(args[7], Double.parseDouble(args[8]));
		System.out.println ("Infine apriamo il conto numero: " + conto3.getCodice() + ", intestato a: " + conto3.getCorrentista() + ", con un saldo di: " + conto3.getSaldo());
	}
}
