import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class DateTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   @Test 
   public void addDaysTest() {
      // 11 tests of Date.addDays() in this case
      // Several verified with WolframAlpha.com
      // days from 12/25/2020 to 12/25/3000 result: 357937 days
      Date d = new Date(11,1,2017);
      d = d.addDays(1);
      Date e = new Date(11,2,2017);
      Assert.assertEquals(e.toString(), d.toString());

      d = new Date(11,1,2017);
      d = d.addDays(29);
      e = new Date(11,30,2017);
      Assert.assertEquals(e.toString(), d.toString());

      d = new Date(11,1,2017);
      d = d.addDays(30);
      e = new Date(12,1,2017);
      Assert.assertEquals(e.toString(), d.toString());

      d = new Date(11,1,2017);
      d = d.addDays(35);
      e = new Date(12,6,2017);
      Assert.assertEquals(e.toString(), d.toString());

      d = new Date(3,18,2015);
      d = d.addDays(25);
      e = new Date(4,12,2015);
      Assert.assertEquals(e.toString(), d.toString());

      // check leap year
      d = new Date(2,27,2020);
      d = d.addDays(2);
      e = new Date(2,29,2020);
      Assert.assertEquals(e.toString(), d.toString());

      d = new Date(2,27,2020);
      d = d.addDays(3);
      e = new Date(3,1,2020);
      Assert.assertEquals(e.toString(), d.toString());

      // check not leap year
      d = new Date(2,27,2017);
      d = d.addDays(3);
      e = new Date(3,2,2017);
      Assert.assertEquals(e.toString(), d.toString());

      d = new Date(2,27,2020);
      d = d.addDays(365);
      e = new Date(2,26,2021);
      Assert.assertEquals(e.toString(), d.toString());

      d = new Date(2,27,2017);
      d = d.addDays(365);
      e = new Date(2,27,2018);
      Assert.assertEquals(e.toString(), d.toString());
      

      d = new Date(12,25,2020);
      d = d.addDays(357937);
      e = new Date(12,25,3000);
      Assert.assertEquals(e.toString(), d.toString());
   }

}
