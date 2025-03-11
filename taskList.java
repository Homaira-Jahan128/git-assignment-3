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
            int choice = getUserChoice();
            if (choice == ADD_ITEM) {
                addItem();
            } else if (choice == REMOVE_ITEM) {
                removeItem();
            } else if (choice == SHOW_ITEMS) {
                showItems();
            } else if (choice == EXIT) {
                break;
            }
        }
    }

    private static int getUserChoice() {
        System.out.println("1: Add 2: Remove 3: Show 4: Exit");
        return scanner.nextInt();
    }

    private static void addItem() {
        System.out.print("N: ");
        scanner.nextLine();
        taskList.add(scanner.nextLine());
    }

    private static void removeItem() {
        System.out.print("I: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
        }
    }

    private static void showItems() {
        for (int position = 0; position < taskList.size(); position++) {
            System.out.println(position + ": " + taskList.get(position));
        }
    }g
}