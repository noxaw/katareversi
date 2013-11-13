package katareversi;

public class Reversi {
	
	private String plateau;
	private String joueurActif;
	private String joueurPassif;

	public String donnePossibilites(String valeurPlateau) {
		plateau = valeurPlateau;
		
		this.joueurEstBlanc();
		
		/*if(plateau.contains(joueurActif+joueurPassif+".")){
			return plateau.replaceAll(joueurActif+joueurPassif+".", joueurActif+joueurPassif+"0");
		}*/
		
		String retour = plateau.replaceAll(joueurActif+"("+joueurPassif+"+)\\.", ""+joueurActif+"$10");
		retour = retour.replaceAll("\\.(W+)B", "0$1B");
		System.out.println(retour);
		return retour;
	}
	
	public void joueurEstBlanc(){
		if(plateau.charAt(plateau.length()-1) == "W".charAt(0)){
			joueurActif = "W";
			joueurPassif = "B";
		}
		else{
			joueurActif = "B";
			joueurPassif = "W";
		}
	}
	
}
