package katareversi;

public class Reversi {
	
	public String donnePossibilites(String valeurPlateau) {
		char joueurActif = joueurEstBlanc(valeurPlateau);
		char joueurPassif = joueurActif == 'B' ? 'W' : 'B';
		
		String possibilites = tester(valeurPlateau, joueurActif, joueurPassif);
		possibilites = tester(passeEnLigne(possibilites), joueurActif, joueurPassif);
		return passeEnLigne(possibilites);		
	}
	
	public char joueurEstBlanc(String plateau){
		return plateau.charAt(plateau.length()-1);
	}
	
	public String tester(String test, char jActif, char jPassif){
		String retour = test.replaceAll(jActif+"("+jPassif+"+)\\.", ""+jActif+"$10");
		retour = retour.replaceAll("\\.("+jPassif+"+)"+jActif+"", "0$1"+jActif+"");
		return retour;
	}

	public String passeEnLigne(String in) {
		String[] meslignes = in.split("\n");
		String maColonne = "";
		maColonne = parcoursColonnes(meslignes, maColonne);
		maColonne = maColonne + meslignes[meslignes.length-1];
		return maColonne;
	}

	public String parcoursColonnes(String[] meslignes, String maColonne) {
		for(int j = 1; j<meslignes[0].length()+1 ; j++)
		{
			maColonne = parcoursLignes(meslignes, maColonne, j);
			maColonne = maColonne +"\n";
		}
		return maColonne;
	}

	public String parcoursLignes(String[] meslignes, String maColonne, int j) {
		for(int i = 0; i<meslignes.length-1; i++)			
			maColonne = maColonne + meslignes[i].charAt(j-1);
		return maColonne;
	}
	
}
