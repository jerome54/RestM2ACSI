package Test;

import Model.Demande;
import Model.Demande.EtatDemande;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class de test pour une demande
 * @author 
 */
public class DemandeTest {
    
    public DemandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void CreationDemande() {
         //CReation de la demande
         Demande d = new Demande(1,"nomtest","prenomtest","adresseTest",EtatDemande.DEBUT);
    
         assertEquals(d.getIdDemande(), 1);
     }
}
