package Java_Work;
public class Year_Problem_1 {
    public static void main(String[] args) {
        int day=1,month=1,year=1;
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("01-01-0001 was " +days[1]);
        for(year = 1 ; year<20;year++)
        {
        int d=(((year/4)+year)%7);
        System.out.println("Day on "+day+":"+month+":"+year+" = " + days[d]);
        }
    }
    
}
