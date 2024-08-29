import java.util.LinkedList;
import java.util.ListIterator;

/**
   This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{


	public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator1 = strings.listIterator();
        ListIterator<String> iterator2 = strings.listIterator(); // descendingIterator
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        int counter = 0;
        while (counter < strings.size()) 
        {
            String string1 = iterator1.next();
            String string2 = iterator2.previous();
            iterator1.set(string2);
            iterator2.set(string1);
            counter++;
        }
    }



   /**
      Reverses the elements in a linked list
      @param strings the linked list to reverse
   */
   public static void reverse2(LinkedList<String> strings)
   {
      if (strings.size() > 1)
      {
         String s = strings.removeFirst();
         reverse2(strings);
         strings.addLast(s);
      }
   }
}