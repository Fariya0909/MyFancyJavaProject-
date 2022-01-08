import java.io.*;
  
class MySingleton
{
    static MySingleton instance = null;
    public int a = 10;
    public int b = 5;

    private MySingleton() {  }
   
  
    static public MySingleton getInstance()
    {
        if (instance == null)        
             instance = new MySingleton();
   
        return instance;
    } 
}
{
   public static void main(String args[])    
   {
       MySingleton add = MySingleton.getInstance();
       MySingleton sub = MySingleton.getInstance();
       add = add.a - add.b;
       sub= sub.a- sub.b;
       System.out.println("Value of add = " + add);
       System.out.println("Value of sub = " + sub);
   }    
}