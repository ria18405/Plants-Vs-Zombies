package sample;

import java.io.*;

public class Serialise {

    public  static  void  serialize(User u )  throws IOException
    {
//    Manager  s1  =  new  Manager("Amy");
        ObjectOutputStream out  =  null;
        try  {
            System.out.println("serialised");
            out  = new ObjectOutputStream (new FileOutputStream(u.name));
            out.writeObject(u);
        }

        finally
        {
            out.close();

        }

    }
    public  static  void  deserialize()  throws  IOException,  ClassNotFoundException {
        ObjectInputStream  in  =  null;
        try
        {
            in = new ObjectInputStream(new FileInputStream("ria"));
            User s1  = (User) in.readObject();

        }
        finally
        {
            in.close();
        }
    }
}