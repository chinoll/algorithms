import edu.princeton.cs.algs4.*;
public class smartdate {
  public static class SmartDate {
    private int iDay;
    private int iMonth;
    private int iYear;
    public int Day() {
      return iDay;
    }
    public int Month() {
      return iMonth;
    }
    public int Year() {
      return iYear;
    }
    public String toString() {
      return iMonth + "/" + iDay + "/" + iYear;
    }
    public SmartDate(int month,int day,int year) {
      if(month > 12 || month < 0 || day > 31 || day < 0 || year < 0)
        throw new java.lang.IllegalArgumentException(day + "/" + month + "/" + year);
      if(month == 2 && day >= 29) {
        if(!(year%4==0 && year%100 != 0 || year%400 == 0) && day > 28) {
          throw new java.lang.IllegalArgumentException(day + "/" + month + "/" + year);
        }
      }

      iMonth = month;
      iYear = year;
      switch(month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          iDay = day;
          break;
        case 2:
        case 4:
        case 6:
        case 9:
        case 11:
          if(day > 30)
            throw new java.lang.IllegalArgumentException(day + "/" + month + "/" + year);
          iDay = day;
          break;
        default:
          throw new java.lang.IllegalArgumentException("Error");
      }
    }
  }
  public static void main(String[] args) {
    //Test
    StdOut.println(new smartdate.SmartDate(2,29,2000));
    StdOut.println(new smartdate.SmartDate(3,31,2018));
    try {
      new smartdate.SmartDate(29,2,2001);
    } catch(Exception e) {
      StdOut.println(e);
    }
    try{
      new smartdate.SmartDate(31,4,2001);
    } catch(Exception e) {
      StdOut.println(e);
    }
    try{
      new smartdate.SmartDate(31,13,2001);
    } catch(Exception e) {
      StdOut.println(e);
    }
  }
}
