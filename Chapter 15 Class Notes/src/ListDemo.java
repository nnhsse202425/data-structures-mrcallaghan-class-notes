import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        /*
         * The addLast method can be used to populate a LinkedList.
         */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        // The list is currently: DHRT

        System.out.println("staff: " + staff);

        /*
         * The listIterator method creates a new list iterator that is 
         * positioned at the beginning of the list.
         * The "|" in the comment represents the iterator position.
         */

         ListIterator<String> iterator = staff.listIterator();  // |DHRT

         /*
          * The next method advances the iterator over the next element in the list.
          */
          iterator.next();  // D|HRT

          /*
           * The next method also returns the element that the iterator
           *    is passing.
           */
          String name = iterator.next();  // DH|RT
          System.out.println(name);
          System.out.println("Expected: Harry");

          /*
           * The add method inserts an element at the iterator position.
           * The iterator is then positioned after the element that was added.
           * (the text is a bit confusing on this point)
           */
          iterator.add("Juliet");  // DHJ|RT
          iterator.add("Nina");  // DHJN|RT

          /*
           * The remove method removes the element returned by the last call to 
           *   next or previous.
           * The remove method can only be called once after calling next or previous.
           * The remove method cannot be called after calling add.
           */
          iterator.next();  // DHJNR|T
          iterator.remove();  // DHJN|T

          System.out.println("staff: " + staff);
          System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");

          /*
           * The set method updates the element returned by the last call to next or previous.
           */
          iterator.previous();  // DHJ|NT
          iterator.set("Albert");  // DHJ|AT

          /*
           * The hasNext method is often used in the context of a while loop.
           */
          iterator = staff.listIterator();  // |DHJAT
          while (iterator.hasNext())
          {
            String n = iterator.next();     // DHJ|AT
            if(n.equals("Juliet")) 
            {
                iterator.remove();  // DH|AT
            }
          }   // DHAT|

        /*
         * Enhanced for loops work with LinkedLists
         */

         for (String n : staff)
         {
             System.out.println(n + " ");
         }

         System.out.println("Expected: Diana Harry Albert Tom");


        /*
         * ConcurrentModificationException
         * 
         * Cannot modify a LinkedList while also using an iterator
         *  unless you use the iterator to do so.
         */

         iterator = staff.listIterator();  // |DHAT
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if(n.equals("Harry"))
            {
                //staff.remove("Diana");
            }
        }

        /*
         * ConcurrentModificationException
         * 
         * The enhanced for loop automatically creates an iterator!
         * That is how it works!
         */
        for (String n : staff)
        {
            if(n.equals("Harry"))
            {
                staff.add("Charlie");
            }
        }

    }
}
