import java.util.Deque;
import java.util.ArrayDeque;
public class Dequepro{
 public static void main(String[] args){
  Deque<String> deque=new ArrayDeque<>();
  deque.addFirst("One");
  deque.addLast("Two");
  deque.addFirst("Zero");
  deque.addLast("Three");
  System.out.println("Deque after additions: "+deque);
  String removefront=deque.removeFirst();
  String removeRear=deque.removeLast();
  System.out.println("Remove from front: "+removefront);
  System.out.println("Remove from Rear: "+removeRear);
  System.out.println("Deque after removals: "+deque);
  System.out.println("Peek First: "+deque.peekFirst());
  System.out.println("Peek Last: "+deque.peekLast());
 }
}
