package es.iessoterohernandez.daw.endes.Boletin.boletinJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountTest.class, OperadorAritmeticoTest.class, SubscripcionTest.class })
public class AllTests {

}
