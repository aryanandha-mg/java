import java.util.*;
public class Mappro{
 public static void main(String[] args){
  Map<Integer,String> map=new HashMap<>();
  Scanner sc=new Scanner(System.in);
  System.out.println("Menu");
  System.out.println("1.Add an element");
  System.out.println("2.Update an element");
  System.out.println("3.Remove an element");
  System.out.println("4.Display Map");
  System.out.println("5.Exit");
  while(true){
   System.out.print("Choose an operation: ");
   int ch=sc.nextInt();
   sc.nextLine();
   switch(ch){
case 1:
  System.out.print("Enter the key(integer): ");
  int addkey=sc.nextInt();
  sc.nextLine();
  System.out.print("Enter the value(string): ");
  String addvalue=sc.nextLine();
  map.put(addkey,addvalue);
  System.out.println("Element added");
  break;
case 2:
  System.out.print("Enter the key to update: ");
  int updatekey=sc.nextInt();
  sc.nextLine();
  if(map.containsKey(updatekey)){
  System.out.print("Enter the new value for key "+updatekey+": ");
  String newvalue=sc.nextLine();
  map.put(updatekey,newvalue);
  System.out.println("Element updated");
  }else{
  System.out.println("Key "+updatekey+" not found in the map");
  }
  break;
case 3:
  System.out.print("Enter the key to remove: ");
  int removekey=sc.nextInt();
  if(map.containsKey(removekey)){
  map.remove(removekey);
  System.out.println("Element removed");
  }
  else{
  System.out.println("Key "+removekey+" not found in the map");
  }
  break;
case 4:
System.out.println("Map contents: " + map);
break;
        case 5:
  System.out.println("Exiting....");
  sc.close();
  System.exit(0);
default:
  System.out.println("Invalid Choice");
   }
  }
 }
}

