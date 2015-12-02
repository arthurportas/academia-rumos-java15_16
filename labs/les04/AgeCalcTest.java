
public class AgeCalcTest {

    public static void main(String args[]) {

        AgeCalc oneYearAgeCalc = new AgeCalc();
        oneYearAgeCalc.calculateAge();
        
        System.out.println("-------------------");
        AgeCalc twentyFourYearAgeCalc = new AgeCalc();
        twentyFourYearAgeCalc.year = 24;
        twentyFourYearAgeCalc.calculateAge();
        
        System.out.println("-------------------");
        AgeCalc eightyYearAgeCalc = new AgeCalc();
        eightyYearAgeCalc.year = 80;
        eightyYearAgeCalc.calculateAge();
    }
}
