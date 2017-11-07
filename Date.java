// CSIS 251 Principles of Programming I
// Fall 2017
//
// Project (pr4) Date and ExtendedDate classes using inheritance
// Template starter code for Date class
public class Date {
   private int month;
   private int day;
   private int year;

   public Date() {
      month = 1;
      day = 1;
      year = 1500;
   }

   public Date(int mm, int dd, int yyyy) {
      month = mm;
      day = dd;
      year = yyyy;
   }
   
   public void setDate(int mm, int dd, int yyyy) {
      month = mm;
      day = dd;
      year = yyyy;
   }
   
   public int getMonth() {
      return month;
   }

   public int getDay() {
        return day;
   }

   public int getYear() {
      return year;
   }

   public String toString() {
      return (getMonth() + "/" + getDay() + "/" + getYear());
   }
}