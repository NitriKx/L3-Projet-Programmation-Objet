package app;
import java.net.InetAddress;
import java.text.DateFormat;
import java.util.Date;

import serveur.Arene;

/**
 * Lancement de l'{@link Arene}. A lancer en premier.
 */
public class TestServeur {
	
	public static int port = 5099; 

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		int port=5099;	//par defaut, port=5099
		int taillePile = 1; //par defaut les elements arrivent directement, pas de pile
		if (args.length!=0) {
			port=Integer.parseInt(args[0]);
			taillePile = Integer.parseInt(args[1]);
		}
		//String ipNameArene = "ouvea.edu.ups-tlse.fr"; // le nom de la machine sur laquelle tourne l'arene
		String ipNameArene = "localhost"; // le nom de la machine sur laquelle tourne l'arene
		
		System.out.println("Creation du registre RMI sur le port "+port+"...");
		java.rmi.registry.LocateRegistry.createRegistry(port);
	    
	    System.out.println("Creation du serveur sur le port "+port+"...");
	    Arene server=new Arene(port, ipNameArene,taillePile);
	    
	    while(true) {
	    	System.out.println("[Arene sur "+InetAddress.getLocalHost().getCanonicalHostName()+":"+port+"] "
	    			+DateFormat.getTimeInstance().format(new Date())
	    			+" ("+server.countClients()+" clients)"
	    			+"\n");
	    	try {
	    		Thread.sleep(1000*60); //delai = 1 minute
	    	} catch (InterruptedException e) {}
	    }

	}

}
