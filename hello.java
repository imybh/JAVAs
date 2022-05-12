import java.io.*;
class createfile
{
    public static void main(String args[]) throws IOException
    {
        File f = new File ("Hello.txt");
        
        if(f.createNewFile())
        {
            System.out.println("File Created Succesfully");
        }
        else 
        {
            System.out.println("File Already Exists");
        }
    }
}