import java.util.Scanner;

public class CalculateurMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		/*
		 * Initiation Java - Exercices Niveau Intermédiaire Exercice 1 :
		 * "Le calculateur de moyenne" Vous êtes chargé de concevoir un programme pour
		 * une école qui veut automatiser le calcul des moyennes de plusieurs élèves.
		 * Chaque élève a plusieurs notes, et le programme doit calculer la moyenne de
		 * chaque élève, ainsi que la moyenne générale de toute la classe.
		 */
		Scanner myObj = new Scanner(System.in);
		int nbEleves= 0;
		int nbNotes = 0;
		
		System.out.println("Entrez un nombre d'éléves");
		nbEleves = myObj.nextInt();
		
		System.out.println("Entrez un nombre de notes");
		nbNotes = myObj.nextInt();
		
		int[][] intElevesNotes = new int[nbEleves][nbNotes];
		
	    for (int i = 0; i < intElevesNotes.length; ++i) {
	    	System.out.println("Entrez les notes pour l'éléve ********************************* " + i);
		    for (int j= 0; j < intElevesNotes[i].length; ++j) {
		    	System.out.println("Entrez la note " + j);	
		    	intElevesNotes[i][j] = myObj.nextInt();
		      } 
	     } 
	    
	    int MoyeneEleve = 0;
	    int MoyeneClasse = 0;
	    int nbNotesClasse = 0;

	    for (int i = 0; i < intElevesNotes.length; ++i) {
	    	MoyeneEleve = 0;
	    	System.out.print("La moyene des notes pour l'éléve " + i);
	    	for (int j= 0; j < intElevesNotes[i].length; ++j) {
	    		MoyeneEleve += intElevesNotes[i][j];
	    		MoyeneClasse += intElevesNotes[i][j];
	    		nbNotesClasse += 1;
	    	}
	    	MoyeneEleve /= intElevesNotes[i].length;
	    	System.out.println(" est " + MoyeneEleve);
	    }

	    System.out.println("Total notes classe " + MoyeneClasse);
	    System.out.println("Nombres notes classe " + nbNotesClasse);
	    MoyeneClasse /= nbNotesClasse;
	    System.out.println("La moyene des notes pour la classe est " + MoyeneClasse);

	    myObj.close();
		
		
	}

}
