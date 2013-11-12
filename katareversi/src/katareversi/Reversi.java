package katareversi;

public class Reversi {
	private String plateau = ""+
			"........\n"+
			"........\n"+
			"........\n"+
			"...BW...\n"+
			"...WB...\n"+
			"........\n"+
			"........\n"+
			"........\n"+
			"B";

	public String donnePlateau() {
		return plateau;
	}
	
	public Reversi montrePossibilites(){

		if(plateau.charAt(plateau.length()-1)=="W".charAt(0) )
		{
		plateau =""+
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
		
		if(plateau.charAt(plateau.length()-1)=="B".charAt(0) )
		{
		plateau =""+
				"........\n"+
				"........\n"+
				"....0...\n"+
				"...BW0..\n"+
				"..0WB...\n"+
				"...0....\n"+
				"........\n"+
				"........\n"+
				"B";
		}
		return this;
	}
	
	public Reversi changeTour(){
		if(plateau.charAt(plateau.length()-1)=="W".charAt(0) )
		{
			plateau=plateau.substring(0, plateau.length()-2);
			plateau.concat("B");
		}
		if(plateau.charAt(plateau.length()-1)=="B".charAt(0) )
		{
			plateau=plateau.substring(0, plateau.length()-2);
			plateau.concat("W");
		}
		return this;
	}
	
}
