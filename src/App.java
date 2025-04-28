
package src;
import lib.*;
import java.util.Scanner;
//@SuppressWarnings("unused")

public class App {
    public static void main(String[] args)
    {
        queue obj = new queue(9);
        obj.app();
    }
}


class queue
{

    private Scanner scan = new Scanner(System.in);
    int front, rear, size, count;

    int[] queue;
    public queue(int x)
    {
        size = x;
        queue = new int[size];
        front = rear = -1;
	count = 0;
    }

    private int inc(int val)
    {
	val = (val+1)%this.size ;
	return val;
    }

    private boolean isEmpty()
    {
        if(this.front == this.rear && this.rear == -1)
        {
            return true;
        }else 
	{
            return false;
        }
    }

    private boolean isFull() {
        if(this.front == (this.rear+1)%this.size )
	{
            return true;
        } else {
            return false;
        }
    }    

    private int peek()
    {
        if(isEmpty())
        {
            return 0;
        }else
        {
            return this.queue[this.front];
        }
    }

    private int count()
    {
	return this.count;
    }

    private void display()
    {
        //console.clear();
        if(!(isEmpty()))
        {
            System.out.print("Actual Queue :[ ");
	    int i = front;
	    int k = count;
	    for(  ; k != 0 ; i = (i+1)%size ) // damn it took 20min for this idea to come in my mind XD
            {   
                System.out.print("'" + this.queue[i] + "'");
		if( k-1 > 0 )
		{
                    System.out.print(" , ");
		}
		k--;
            }
            System.out.print(" ]"); 
            System.out.println("");
            System.out.print("Array        :[ "); 
            for(int j = 0 ; j < this.size ; j++ )
            {
                System.out.print("'" + this.queue[j] + "'");
		if(j<this.size-1)
		{
                    System.out.print(" , ");
		} 
            }
            System.out.print(" ]"); 
            System.out.println("");
        }else if(isEmpty())
        {
            System.out.println("The queue is empty !!");
        }else
        {
            System.out.println("The queue is empty !!");
        }
    }

    private void enqueue(int x)
    {
        if(isFull())
        {
            return;
        }
        else if(isEmpty())
        {
            this.front = this.rear = 0;
            queue[this.rear] = x;
        }
        else
        {
            if(this.front != (this.rear+1)%this.size )
            {
                this.rear = this.inc(this.rear);  //increment rear ptr
                queue[this.rear] = x;
            }
        }
	count++;
    }

    private int dequeue()
    {
        int x;
        if(isEmpty() )  //if the queue is empty
        {
            return -1;
        }
        else if( this.front == this.rear )
        {
            x = queue[this.front];
            queue[this.front] = 0;
            this.front = this.rear = -1;
	    count--;
        }
        else
        {
            x = queue[this.front];
            queue[this.front] = 0;
            this.front = this.inc(this.front);   // increment front ptr
	    count--;
        }
        return x;
    }

    private void menu()
    {
        display();
        System.out.print("0. Exit\n");
	System.out.print("1. enqueue\n");
        System.out.print("2. dequeue\n");
        System.out.print("3. Peek\n");
        System.out.print("4. isEmpty\n");
        System.out.print("5. isFull\n");
        System.out.print("6. size\n");
        System.out.print("9. Display\n");
        input();
    }

    /**
     * 
     */
    private void input()
    {
        System.out.print("Enter Your Choice: ");
        String input = scan.nextLine();

        if(input.equals("1"))   //enqueue
        {
            console.clear();
            if(isFull())
            {
                System.out.println("The queue is full !!");
            }else
            {
                System.out.print("Enter Integer number to add to the Queue: ");
                String push = scan.nextLine();
                this.enqueue(Integer.valueOf(push));
                System.out.print("The value '"+push+"' is added to the rear position: "+ (this.rear+1)%this.size +"\n");
            }
            this.menu();
        }
        else if (input.equals("2"))   //dequeue
        {
            console.clear();
            if(!(isEmpty()))
            {
                int x = dequeue();
                System.out.println("One data:'"+ x +"' is removed from the front");
            }
            else
            {
                System.out.println("The queue is already empty !!");
            }
            this.menu();
        }
        else if (input.equals("3"))   //peek
        {
            console.clear();
            if(isEmpty())
            {
                System.out.println("The queue is empty to be peeked");
            }else
            {
                System.out.println("The front is :" + this.peek());
            }
            this.menu();
        }
        else if (input.equals("4"))  //isEmpty
        {
            console.clear();
            // System.out.print("Enter Integer number to add to the Stack: ");
            // String push = scan.nextLine();
            if(this.isEmpty())
            {
                System.out.println("The queue is empty");
            }
            else
            {
                System.out.println("The queue has some data");
            }
            this.menu();
        }
        else if (input.equals("5"))   //isFull
        {
            console.clear();
            // System.out.print("Enter Integer number to add to the Stack: ");
            // String push = scan.nextLine();
            if(this.isFull())
            {
                System.out.println("The queue is Full");
            }
            else
            {
                System.out.println("The queue does not have enough data");
            }
            this.menu();
        }
	else if(input.equals("6"))
	{
            console.clear();
	    System.out.println( "The queue size: " + this.count() );
	    this.menu();
        }
        else if(input.equals("9"))  //display
        {
            console.clear();
            this.display();
            this.menu();
        }
        else if(input.equals("0")) //exit
        {
            console.clear();
            return;
        }
        else //if(input.equals("null"))
        {
            console.clear();
            System.out.print("Wrong option\n");
            this.menu();
        }

    }

    public void app()
    {
        this.menu();
    }

    /*
    public static void main (String[] args)
    {

        queue queue = new queue(9);
        queue.app();
        //console.clear();
        

    }
    */
}
