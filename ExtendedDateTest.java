import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ExtendedDateTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   @Test 
   public void defaultTest() {
      ExtendedDate d = new ExtendedDate();
      d.setDate(3, 24, 2015);
      Assert.assertEquals("March 24, 2015", d.toString());
      
      ExtendedDate d2 = new ExtendedDate(d);
      Assert.assertEquals("March 24, 2015", d2.toString());
   }
}
