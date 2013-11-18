package katareversi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestsApp {
	
	private Reversi jeu;

	
	@Before
	public void withCalcInstance() {
		this.jeu = new Reversi();
	}
	
	@Parameters
    public static List<String[]> getParametres() {
        return Arrays.asList(new String[][] {
                { 	""+
        				"........\n"+
        				"........\n"+
        				"........\n"+
        				"...BW...\n"+
        				"...WB...\n"+
        				"........\n"+
        				"........\n"+
        				"........\n"+
        				"W", 
        				
	        					""+
	        						"........\n"+
	        						"........\n"+
	        						"...0....\n"+
	        						"..0BW...\n"+
	        						"...WB0..\n"+
	        						"....0...\n"+
	        						"........\n"+
	        						"........\n"+
	        						"W" },
                 	{""+
        				"........\n"+
        				"........\n"+
        				"........\n"+
        				"...BW...\n"+
        				"...WB...\n"+
        				"........\n"+
        				"........\n"+
        				"........\n"+
        				"B", 
        						""+
	        						"........\n"+
	        						"........\n"+
	        						"....0...\n"+
	        						"...BW0..\n"+
	        						"..0WB...\n"+
	        						"...0....\n"+
	        						"........\n"+
	        						"........\n"+
	        						"B"},
                
                	{
            		//ça
                	"...WB...\n"
                	+ "...WB...\nW",
                		//retourne ça
                		"...WB0..\n"
                		+ "...WB0..\nW"},
                	
                	{
            		//ça
                	"...BWW..\nB",
                		//retourne ça
                		"...BWW0.\nB"},
                		
                	{
            		//ça
                	"...BW...\nW",
                		//retourne ça
                		"..0BW...\nW"},
                		
                	{
            		//ça
                	"...WB...\nB",
                		//retourne ça
                		"..0WB...\nB"},
                		
                	
                		
	        						});
        }

        
    private String resultatPossibilites;
    private String plateauInput;

    public TestsApp(String variable, String resultat) {
    	resultatPossibilites = resultat;
    	plateauInput = variable;
    }

	@Test
	    public void TestsPossibilites() {
	        String retour = jeu.donnePossibilites(plateauInput);
	        assertEquals(resultatPossibilites, retour);
	    }
	
	@Test	
	public void TestColonneToLigne(){
			assertEquals("WB.\nW" ,jeu.passeEnLigne("W\n"+
													"B\n"+
													".\n"+
													"W"));
		}
	
	@Test	
	public void TestColonnesToLignes(){
			assertEquals("WB.\n"
						+ "WB.\nW" ,jeu.passeEnLigne("WW\n"+
													"BB\n"+
													"..\n"+
													"W"));
		}

	
}
