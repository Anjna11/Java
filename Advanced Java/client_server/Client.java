import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) throws Exception {
        
        Socket s = new Socket("localhost", 1111);
        
        if(s.isConnected())
        {
            System.out.println("Connected To The Server...");
        }

        FileOutputStream fout = new FileOutputStream("receive.txt");
        DataInputStream din = new DataInputStream(s.getInputStream());

        int r;
        while((r = din.read()) != -1){
            fout.write((char)r);
        }
        s.close();
    }
}