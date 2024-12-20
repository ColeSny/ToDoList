package ToDoList;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListManager {
    private static Scanner kb = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> status = new ArrayList<>();

        Boolean exit = false;

        System.out.println("Welcome to the To Do list manager.");

        while(exit != true){

            int choice = menu();
            kb.nextLine();
            switch(choice){
                case 1:
                    System.out.print("\nEnter the task: ");
                    String task = kb.nextLine();
                    tasks.add(task);
                    status.add(false);

                    break;
                case 2:
                    System.out.print("\nYour tasks: \n");
                    for(int i =0; i <tasks.size(); i++){
                        System.out.println(tasks.get(i) +" | Status: " + status.get(i) + "\n");
                    }
                    break;
                case 3:
                    System.out.print("\nEnter the task number to mark as completed: ");
                    int pos = kb.nextInt();
                    if(pos > 0  && pos <= tasks.size()){
                        status.set(pos-1, true);
                        System.out.println("Task complete! \n");
                    }else{
                        System.out.println("Invalid number. \n");
                    }
                    break;
                case 4:
                    System.out.println("exiting...");
                    exit = true;
                    break;
            }
        }
        System.out.println("Thank you! \nGoodbye!");
    }

    private static int menu(){
        int choice = 0;
        System.out.println("Please chose one of the following:");
        System.out.println("1. Add a task");
        System.out.println("2. View Task");
        System.out.println("3. Mark task as complete");
        System.out.println("4. Exit");

        choice = kb.nextInt();
        return choice;
    }
}
