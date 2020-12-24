
package queue;

/**
 *
 * @author asim
 */
public class Queue 
{
    int front,rear;
    int arr[];
    int size;

    
    public Queue(int s)
    {
        front=0;
        rear=-1;
        size=s;
        arr=new int[size];
    }
    
    
    
    public boolean isEmpty()
    {
        return front==-1 && rear==-1;
    }
    
    public boolean isFull()
    {
        return rear==size-1;
    }
    
    public void enqueue(int val)
    {
        if(!isFull())
            arr[++rear]=val;
    }
    
    public int dequeue()
    {
        return arr[front++];
    }
    
    
}
