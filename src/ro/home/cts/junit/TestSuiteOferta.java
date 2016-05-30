package ro.home.cts.junit;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteOferta extends TestCase {

	public static Test suite(){
		TestSuite colectie=new TestSuite();
		colectie.addTestSuite(TestCaseConstructorOferta.class);
		colectie.addTestSuite(TestCaseCostCazareOferta.class);
		colectie.addTestSuite(TestCaseCostMicDejunOferta.class);
		colectie.addTestSuite(TestCaseCostTotalOferta.class);
		colectie.addTestSuite(TestCaseDiscountCazareOferta.class);
		colectie.addTestSuite(TestCaseDiscountMicDejunOferta.class);
		colectie.addTestSuite(TestCaseOfertaMicDejunOferta.class);
		colectie.addTestSuite(TestCaseOfertaZileOferta.class);
		colectie.addTestSuite(TestCaseSetHotelOferta.class);
		colectie.addTestSuite(TestCaseSetNrSteleOferta.class);
		return colectie;
		
		
	}

}
