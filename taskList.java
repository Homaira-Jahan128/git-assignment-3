import java.util.*;

class TaskManager {
    static Scanner scanner = new Scanner(System.in);
    static List<String> taskList = new ArrayList<>();

    private static final int ADD_ITEM = 1;
    private static final int REMOVE_ITEM = 2;
    private static final int SHOW_ITEMS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        try {
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
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } finally {
            scanner.close();
        }
    }

    private static int getUserChoice() {
        System.out.println("1: Add 2: Remove 3: Show 4: Exit");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        return choice;
    }

    private static void addItem() {
        System.out.print("N: ");
        taskList.add(scanner.nextLine());
    }

    private static void removeItem() {
        System.out.print("I: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private static void showItems() {
        int taskIndex = 0;
        for (String task : taskList) {
            System.out.println(taskIndex + ": " + task);
            taskIndex++;
        }
    }
}