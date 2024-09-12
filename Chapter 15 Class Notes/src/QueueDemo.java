import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        // create a print queue of strings (using a linked list)
        Queue<String> jobs = new LinkedList<>();

        // add several print jobs
        jobs.add("Joe: Senior Yearbook Photos");
        jobs.add("Molly: CS Club photo");

        System.out.println("Printing...: " + jobs.remove());

        jobs.add("Cathy: Sophomore photos");
        jobs.add("Joe: Google doc");
        jobs.add("Joe: freshman photos");

        System.out.println("Printing...: " + jobs.remove());

        jobs.add("Cathy: Junior photos");

        // print the rest of the jobs in queue
        while(jobs.size() > 0)
        {
            System.out.println("Printing: " + jobs.remove());
        }

    }
}
