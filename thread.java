class Thread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0; i<=5; i++)
            {
                System.out.println("Thread1 "+i);
                Thread1.sleep(2000);
            }

        }
        catch(InterruptedException e)
        {
            System.out.println("Thread1 Interruption");
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0; i<=5; i++)
            {
                System.out.println("Thread2 "+i);
                Thread2.sleep(2000);
            }

        }
        catch(InterruptedException e)
        {
            System.out.println("Thread2 Interruption");
        }
    }
}

class thread
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start(); t2.start();
    }
}