import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args){

        ArrayList<String> student=new ArrayList<>();
        student.add("Ram");
        student.add("Abi");
        student.add("Kp");
        student.add("Aara");
        student.add("Arun");
        student.add("Aathi");
        student.add("Priya");
        student.add("Ali");
        student.add("Aathvik");
        student.add("Sushma");
        List<String> studentWith=student.stream()
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Student starts With 'A' :");
        studentWith.forEach(result->System.out.println(result));


    }
}
