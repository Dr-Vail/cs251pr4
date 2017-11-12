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
   public void copyDateTest() {
      Date d1 = new Date(5,5,1600);
      Date d2 = new Date(d1);
      Assert.assertEquals("5/5/1600", d2.toString());
   }
   
   @Test
   public void setDateTest() {
      Date day1 = new Date();
      day1.setDate(1, 1, 1500);
      Assert.assertEquals("1/1/1500", day1.toString());
      day1.setDate(12, 31, 3000);
      Assert.assertEquals("12/31/3000", day1.toString());
      try {
         day1.setDate(12, 31, 1499);
         Assert.fail("Invalid date, date is before 1500.");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
      try {
         day1.setDate(1, 1, 3001);
         Assert.fail("Invalid date, date is after 3001.");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
   
   @Test
   public void daysInMonthTest() {
      Date d = new Date();
      Assert.assertEquals(31, d.daysInMonth());
      d.setDate(2,1,2003);
      Assert.assertEquals(28, d.daysInMonth());
      d.setDate(2,5,2004);
      Assert.assertEquals(29, d.daysInMonth());
      d.setDate(3,5,2004);
      Assert.assertEquals(31, d.daysInMonth());
      d.setDate(4,5,2004);
      Assert.assertEquals(30, d.daysInMonth());
      d.setDate(5,5,2004);
      Assert.assertEquals(31, d.daysInMonth());
      d.setDate(6,5,2004);
      Assert.assertEquals(30, d.daysInMonth());
      d.setDate(7,5,2004);
      Assert.assertEquals(31, d.daysInMonth());
      d.setDate(8,5,2004);
      Assert.assertEquals(31, d.daysInMonth());
      d.setDate(9,5,2004);
      Assert.assertEquals(30, d.daysInMonth());
      d.setDate(10,5,2004);
      Assert.assertEquals(31, d.daysInMonth());
      d.setDate(11,5,2004);
      Assert.assertEquals(30, d.daysInMonth());
      d.setDate(12,5,2004);
      Assert.assertEquals(31, d.daysInMonth());   
   }
   
   @Test
   public void daysPassedThisYearTest() {
      Date d = new Date(1, 1, 1995);
      Assert.assertEquals(1, d.daysPassedThisYear());
      d.setDate(2,1,2000);
      Assert.assertEquals(32, d.daysPassedThisYear());
      d.setDate(12,31,2004);
      Assert.assertEquals(366, d.daysPassedThisYear());
      d.setDate(12,31,2003);
      Assert.assertEquals(365, d.daysPassedThisYear());
      d.setDate(3,1,2004);
      Assert.assertEquals(61, d.daysPassedThisYear());
      d.setDate(3,1,2003);
      Assert.assertEquals(60, d.daysPassedThisYear());
   }
   
   @Test
   public void daysRemainingThisYearTest() {
      Date d = new Date(12, 31, 1995);
      Assert.assertEquals(0, d.daysRemainingThisYear());
      d.setDate(11,30,2000);
      Assert.assertEquals(31, d.daysRemainingThisYear());
      d.setDate(1,1,2004);
      Assert.assertEquals(365, d.daysRemainingThisYear());
      d.setDate(1,1,2003);
      Assert.assertEquals(364, d.daysRemainingThisYear());
   }
   
   @Test
   public void isLeapYearTest() {
      //## test of Date.isLeapYear(int yyyy) 
      //years from 1600 to 3000
      Date d = new Date(12,31,1600);
      Assert.assertEquals(true, d.isLeapYear());
      d = new Date(12,31,1700);
      Assert.assertEquals(false, d.isLeapYear());
      d = new Date(12,31,1800);
      Assert.assertEquals(false, d.isLeapYear());
      d = new Date(12,31,1900);
      Assert.assertEquals(false, d.isLeapYear());
      d = new Date(12,31,2000);
      Assert.assertEquals(true, d.isLeapYear());
      d = new Date(12,31,2001);
      Assert.assertEquals(false, d.isLeapYear());
      d = new Date(12,31,2002);
      Assert.assertEquals(false, d.isLeapYear());
      d = new Date(12,31,2003);
      Assert.assertEquals(false, d.isLeapYear());
      d = new Date(12,31,2004);
      Assert.assertEquals(true, d.isLeapYear());
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

   @Test
   public void saveAndLoadTest() {
      Date d1 = new Date();
      Date d2 = new Date(12,31,2999);
      try {
         d1.save("Test");
         d2.load("Test.date");
         Assert.assertEquals("1/1/1500", d2.toString());
         
         d1.setDate(5,19,2056);
         d1.save("Test1");
         d2.load("Test1.date");
         Assert.assertEquals("5/19/2056", d2.toString());
         
         d1.setDate(8,12,1501);
         d1.save("Test/");
         d2.load("Test3.date");
         Assert.fail("This message should get caught");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
      try {
         d1.setDate(11, 29, 1894);
         d1.save("Test2");
         d2.load("Test3.date");
         Assert.fail("This message should get caught");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
