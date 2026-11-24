import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Input List
        List<String> names = Arrays.asList(
                "John", "Alice", "Bob", "Andrew",
                "David", "Alex", "John", "Bob");

        //Filter Strings starting with character A
        List <String> result=names.stream().filter(n->n.startsWith("A")).toList();
        System.out.println(result);

        //Convert all Strings to Upper Case
        List<String>toUpper=names.stream().map(String::toUpperCase).toList();
        System.out.println(toUpper);

        //Remove Dupplicate String
        List<String> dup=names.stream().distinct().toList();
        System.out.println(dup);

        //Sort Alphabatically
        List<String> sortAsc=names.stream().sorted().toList();
        System.out.println(sortAsc);

        //Sort in reverse order
        List<String> sortDesc=names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortDesc);

        //count number of Strings in List
        Long  num=names.stream().count();
        System.out.println(num);

        //Find first element
        String n=names.stream().findFirst().orElse("null");
        System.out.println(n);

        //Find Any element
        String an=names.stream().findAny().orElse("null");
        System.out.println(an);

        //check if String starts with J
        boolean exists=names.stream().anyMatch(nam->nam.startsWith("J"));
        System.out.println(exists);

        //check if all string length greater than 2
        boolean chek=names.stream().allMatch(nc->nc.length()>2);
        System.out.println(chek);

    }
}