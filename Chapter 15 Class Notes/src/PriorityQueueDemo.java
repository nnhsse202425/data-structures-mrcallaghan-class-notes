import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // create a to do list using a priority queue
        Queue<WorkOrder> q = new PriorityQueue<>();

        q.add(new WorkOrder(3, "water plants"));
        q.add(new WorkOrder(2, "make dinner"));
        q.add(new WorkOrder(1, "ch 15 quiz"));
        q.add(new WorkOrder(9, "play video game"));
        q.add(new WorkOrder(2, "walk dog"));

        while(q.size() > 0)
        {

            System.out.println(q.remove());
        }
    }
}