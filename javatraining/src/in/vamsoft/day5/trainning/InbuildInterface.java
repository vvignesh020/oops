package in.vamsoft.day5.trainning;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuildInterface {
  public static void main(String[] args) {
    Predicate<Integer> eveOrOdd = (x) -> x % 2 == 0 ? true : false;
    System.out.println("is 10 even or odd:" + (eveOrOdd.test(10) ? "10 is even" : "10 is odd"));
    Consumer<String> upperDisplay = str -> System.out.println(str.toUpperCase());
    upperDisplay.accept("vignesh");
    Function<String, Integer> findLength = (str) -> str.length();
    System.out.println("length of data" + findLength.apply("string"));

    Supplier<String> getDate = () -> LocalDate.now().getDayOfWeek().name();
    System.out.println("Today is: " + getDate.get());

  }
}
