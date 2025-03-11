import java.util.*;
class taskList {
static Scanner scanner = new Scanner(System.in);
static List<String> l = new ArrayList<>();
public static void main(String[] args){
  while(true){
System.out.println("1: Add 2: Remove 3: Show 4: Exit");
int choice = scanner.nextInt();
 if(choice==1){
 System.out.print("N: ");
 scanner.nextLine();
   l.add(scanner.nextLine());
   }
else if(choice==2){
System.out.print("I: ");
int index = scanner.nextInt();
   if(index >=0&&index<l.size())l.remove(index);
 }
 else if(choice==3){
for(int position=0;position<l.size();position++)
 {System.out.println(position+": "+l.get(position));}
}
  else if(choice==4)break;}}}
