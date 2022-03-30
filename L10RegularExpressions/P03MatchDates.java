package L10RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([.\\/-])(?<month>[A-z][a-z]{2})\\2(?<year>\\d{4})");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s\n", matcher.group("day"), matcher.group("month"), matcher.group("year"));
        }
    }
}
