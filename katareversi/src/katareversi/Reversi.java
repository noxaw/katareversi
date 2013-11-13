package katareversi;

public class Reversi {
	
	private String plateau;

	public String donnePossibilites(String valeurPlateau) {
		plateau = valeurPlateau;
		
		char joueurActif = joueurEstBlanc();
		char joueurPassif = joueurActif == 'B' ? 'W' : 'B';
		
		String retour = plateau.replaceAll(joueurActif+"("+joueurPassif+"+)\\.", ""+joueurActif+"$10");
		retour = retour.replaceAll("\\.("+joueurPassif+"+)"+joueurActif+"", "0$1"+joueurActif+"");
		return retour;
	}
	
	public char joueurEstBlanc(){
		return plateau.charAt(plateau.length()-1);
	}
	
}
