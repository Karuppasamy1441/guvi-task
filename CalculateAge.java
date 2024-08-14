import java.time.Period;
import java.time.LocalDate;
import java.util.*;
public class CalculateAge {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter birthday (yyyy-mm-dd):");
        String input=in.nextLine();
        LocalDate birthdate=LocalDate.parse(input);
        LocalDate today=LocalDate.now();
        Period age=Period.between(birthdate,today);
        System.out.println("age :"+age.getYears());
    }
}
