import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class RoziWryaDS&Al {
    public static void main(String[] args) {

            Set<String> dictionary = new TreeSet<>();

            dictionary.add("apple - a fruit");
            dictionary.add("book - a set of written pages");
            dictionary.add("cat - a domestic animal");
            dictionary.add("dog - a loyal animal");
            dictionary.add("elephant - a large animal");
            dictionary.add("flower - a colorful plant");
            dictionary.add("grape - a small fruit");
            dictionary.add("house - a place to live");
            dictionary.add("ice - frozen water");
            dictionary.add("jungle - a dense forest");
            dictionary.add("kite - a flying toy");
            dictionary.add("lion - a wild animal");
            dictionary.add("moon - a natural satellite");
            dictionary.add("night - the time of darkness");
            dictionary.add("orange - a citrus fruit");
            dictionary.add("pen - a writing tool");
            dictionary.add("queen - a female ruler");
            dictionary.add("river - flowing water");
            dictionary.add("sun - a star at the center of the solar system");
            dictionary.add("tree - a tall plant");
            dictionary.add("umbrella - a tool for rain protection");
            dictionary.add("violin - a musical instrument");
            dictionary.add("water - essential for life");
            dictionary.add("xylophone - a musical instrument");
            dictionary.add("yacht - a luxury boat");
            dictionary.add("zebra - a striped animal");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("\nEnter letter(s) to search (or 0 to exit): ");
                String input = scanner.nextLine().toLowerCase();

                if (input.equals("0")) {
                    System.out.println("You have left the dictionary");
                    break;
                }

                System.out.println("Choose search type:");
                System.out.println("1. Starts with");
                System.out.println("2. Contains");
                System.out.println("3. Ends with");
                System.out.print("Your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

//found=r
                boolean r = false;
                System.out.println("\nResults (Sorted Alphabetically):\n");

                // Because this is a TreeSet, this loop now visits words in alphabetical order
                for (String entry : dictionary) {
                    String word = entry.substring(0, entry.indexOf(" - ")).toLowerCase();

                    if ((choice == 1 && word.startsWith(input)) ||
                            (choice == 2 && word.contains(input)) ||
                            (choice == 3 && word.endsWith(input))) {
                        System.out.println(entry);
                        r = true;
                    }
                }

                if (!r) {
                    System.out.println("No matching words found.");
                }
            }
            scanner.close();
        }
    }
