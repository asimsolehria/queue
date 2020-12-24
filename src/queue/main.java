
package queue;

/**
 *
 * @author asim
 */
public class main 
{
    public static void main(String[] args) 
    {
        Queue obj = new Queue(10);
        obj.enqueue(10);
        obj.enqueue(15);
        obj.enqueue(16);
        obj.enqueue(20);
        
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
    }
}
