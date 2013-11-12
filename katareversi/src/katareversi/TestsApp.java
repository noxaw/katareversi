package katareversi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestsApp {
	
	private Reversi jeu;
	
	@Before
	public void withCalcInstance() {
		this.jeu = new Reversi();
	}
	
	@Test
	public void TestPlateauInitialAuxNoirs(){
		String resultat =""+
						"........\n"+
						"........\n"+
						"........\n"+
						"...BW...\n"+
						"...WB...\n"+
						"........\n"+
						"........\n"+
						"........\n"+
						"B";
		
		assertEquals(resultat, jeu.donnePlateau());

	}
	
	@Test
	public void TestPlateauPossibiliteJoueurNoir(){
		String resultat =""+
						"........\n"+
						"........\n"+
						"....0...\n"+
						"...BW0..\n"+
						"..0WB...\n"+
						"...0....\n"+
						"........\n"+
						"........\n"+
						"B";
		
		
		assertEquals(resultat, jeu.montrePossibilites().donnePlateau());

	}
	
	@Test
	public void TestPlateauPossibiliteJoueurBlanche(){
		String resultat =""+
						"........\n"+
						"........\n"+
						"...0....\n"+
						"..0BW...\n"+
						"...WB0..\n"+
						"....0...\n"+
						"........\n"+
						"........\n"+
						"W";
		
		
		assertEquals(resultat, jeu.montrePossibilites().donnePlateau());

	}
	
}
