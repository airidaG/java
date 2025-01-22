import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//Using forEach for logging
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        names.forEach(name -> System.out.println("Name: " + name));

//Remove names based on length

//        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Lisa", "Eve", "Robert", "Kate"));
//
//        names.removeIf(name -> name.length() < 4);
//        System.out.println(names);
//

//Modify names using replaceAll

//        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
//
////        names.replaceAll(name -> name.toUpperCase());
//        names.replaceAll(String::toUpperCase);
//        System.out.println(names);


//Find and remove even numbers

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//
//        numbers.removeIf(number -> number % 2 == 0);
//        System.out.println(numbers);

//Append a suffix

//        List<String> tasks = new ArrayList<>(Arrays.asList("task1", "task2", "task3"));
//
//        tasks.replaceAll(task -> task + "_done");
//        System.out.println(tasks);

//Reverse a list

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
//        numbers.sort((num1, num2) -> num2.compareTo(num1));
////        numbers.sort(Comparator.reverseOrder());
//        System.out.println(numbers);

//Remove Strings Containing Specific Characters

//        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
//        words.removeIf(word -> word.contains("e"));
//        System.out.println(words);

//Square Each Number

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        numbers.replaceAll(number -> number * number);
//        System.out.println(numbers);

//Sorting by Last Character

//        List<String> names = new ArrayList<>(Arrays.asList("Eve", "Alice", "Charlie", "Bob"));
////        names.sort((name1, name2) -> Character.compare(name1.charAt(name1.length() - 1), name2.charAt(name2.length() - 1)));
//        names.sort(Comparator.comparingInt(name -> name.charAt(name.length() - 1)));
//        System.out.println(names);

//Count Specific Items

        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "orange", "apple", "banana", "apple"));
        final int[] count = {0};
        fruits.forEach(fruit -> {

            if (fruit.equals("apple")) {
                count[0]++;
            }

        });
        System.out.println("The word 'apple' appears " + count[0] + " times.");
    }
}