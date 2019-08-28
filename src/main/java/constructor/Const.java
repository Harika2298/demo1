package constructor;

public class Const 
{
    private int id;
    private String name;
    public Const(int id,String name)
    {
      this.id=id;
      this.name=name;
    }
    void display() 
    {
       System.out.println(id+" "+name);
    }
}