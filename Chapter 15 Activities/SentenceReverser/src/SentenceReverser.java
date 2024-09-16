import java.util.Scanner;
import java.util.Stack;
/**
   Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
   /**
      Reverses the given sentence.
      @param sentence Sentence to be reversed.
      @return reversed sentence.
   */
   public static String reverse(String sentence)
   {
      String reversed = "";
      Scanner scanner = new Scanner(sentence);
      Stack<String> stack = new Stack<>();
      while (scanner.hasNext())
      {
         String pushWord = scanner.next();
         stack.push(pushWord);
         if (pushWord.contains("."))
         {
            boolean firstWord = true;
            while (stack.size() > 0)
            {
               String popWord = stack.pop();
               if (firstWord)
               {
                  String firstLetter = popWord.substring(0, 1);
                  popWord = firstLetter.toUpperCase() + popWord.substring(1);
                  firstWord = false;
               }
               else
               {
                  popWord = popWord.toLowerCase();
               }
               popWord = popWord.replace(".", "");
               reversed += popWord;
               if (stack.size() <= 0)
               {
                  reversed += ".";
               }
               if (scanner.hasNext() || (stack.size() > 0))
               {
                  reversed += " ";
               }
            }
         }
      }
      return reversed;
   }
}