import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTouppercase {

public static void main(String[] args) {


        List<String> names= Arrays.asList("ab","cd","ef","gh");
        List<String> bigWord=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(bigWord);
    }
}

