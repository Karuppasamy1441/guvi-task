import java.util.*;
import java.util.stream.Collectors;

public class NonEmptyString {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("ab","","be","efg","abc","jkl");

        List<String> nonEmptyString=stringList.stream()
                .filter(s-> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(nonEmptyString);


    }
}