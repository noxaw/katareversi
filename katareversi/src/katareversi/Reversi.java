package katareversi;

public class Reversi {
	
	private String plateau;

	public String donnePossibilites(String valeurPlateau) {
		plateau = valeurPlateau;
		/*if(joueurEstBlanc()){
			return 	""+
					"........\n"+
					"........\n"+
					"...0....\n"+
					"..0BW...\n"+
					"...WB0..\n"+
					"....0...\n"+
					"........\n"+
					"........\n"+
					"W";
		}
		
		return 	""+
				"........\n"+
				"........\n"+
				"....0...\n"+
				"...BW0..\n"+
				"..0WB...\n"+
				"...0....\n"+
				"........\n"+
				"........\n"+
				"B";
		*/
		if(plateau.contains("BW.")){
			return plateau.replaceAll("BW.", "BW0");
		}
		return valeurPlateau;
	}
	
	public boolean joueurEstBlanc(){
		return plateau.charAt(plateau.length()-1) == "W".charAt(0);
	}
	
}
