import java.util.*;
class M {
static Scanner s = new Scanner(System.in);
static List<String> l = new ArrayList<>();
public static void main(String[] a){
  while(true){
System.out.println("1: Add 2: Remove 3: Show 4: Exit");
int c = s.nextInt();
 if(c==1){
 System.out.print("N: ");
 s.nextLine();
   l.add(s.nextLine());
   }
else if(c==2){
System.out.print("I: ");
int i = s.nextInt();
   if(i>=0&&i<l.size())l.remove(i);
 }
 else if(c==3){
for(int j=0;j<l.size();j++)
 {System.out.println(j+": "+l.get(j));}
}
  else if(c==4)break;}}}
