package L05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command){
                case "Add":
                    numList.add(Integer.parseInt(commandLine.get(1)));
                    break;
                case "Remove":
                    numList.remove(Integer.valueOf(Integer.parseInt(commandLine.get(1))));
                    break;
                case "RemoveAt":
                    numList.remove(Integer.parseInt(commandLine.get(1)));
                    break;
                case "Insert":
                    numList.add(Integer.parseInt(commandLine.get(2)), Integer.parseInt(commandLine.get(1)));
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));

    }
}
