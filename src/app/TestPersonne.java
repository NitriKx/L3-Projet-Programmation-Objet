package app;

import individu.Personne;

import java.util.Random;

import controle.Console;

public class TestPersonne {
	
	public static void main(String[] args) throws Exception {
		new Console(new Personne(), new Random().nextInt(100), new Random().nextInt(100), 5099);
	}
	
}
