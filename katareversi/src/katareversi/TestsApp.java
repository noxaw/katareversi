package katareversi;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestsApp {
	
	private Reversi jeu;
	private ArrayList<String> testArrayOutput;
	private ArrayList<String> testArrayInput;
	
	@Before
	public void withCalcInstance() {
		this.jeu = new Reversi();
		
		testArrayInput = new ArrayList<String>();
		
		String in =""+
				"........\n"+
				"........\n"+
				"........\n"+
				"...BW...\n"+
				"...WB...\n"+
				"........\n"+
				"........\n"+
				"........\n"+
				"B";
		testArrayInput.add(in);
		
		String in2 =""+
				"........\n"+
				"........\n"+
				"........\n"+
				"...BW...\n"+
				"...WB...\n"+
				"........\n"+
				"........\n"+
				"........\n"+
				"W";
		testArrayInput.add(in2);
		
		testArrayOutput = new ArrayList<String>();
		
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
		testArrayOutput.add(resultat);
		
		String resultat2 =""+
				"........\n"+
				"........\n"+
				"...0....\n"+
				"..0BW...\n"+
				"...WB0..\n"+
				"....0...\n"+
				"........\n"+
				"........\n"+
				"W";
		testArrayOutput.add(resultat2);
	}
	
	@Test
	public void TestPlateauInitialAuxNoirs(){
		
		assertEquals(testArrayOutput, jeu.donnePossibilites(testArrayInput));

	}
	
}
