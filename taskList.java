import java.util.*;

class TaskManager {
    static Scanner scanner = new Scanner(System.in);
    static List<String> taskList = new ArrayList<>();

    private static final int ADD_ITEM = 1;
    private static final int REMOVE_ITEM = 2;
    private static final int SHOW_ITEMS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1: Add 2: Remove 3: Show 4: Exit");
            int choice = scanner.nextInt();

            if (choice == ADD_ITEM) {
                System.out.print("N: ");
                scanner.nextLine();
                taskList.add(scanner.nextLine());
            } else if (choice == REMOVE_ITEM) {
                System.out.print("I: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < taskList.size()) {
                    taskList.remove(index);
                }
            } else if (choice == SHOW_ITEMS) {
                for (int position = 0; position < taskList.size(); position++) {
                    System.out.println(position + ": " + taskList.get(position));
                }
            } else if (choice == EXIT) {
                break;
            }
        }
    }
}