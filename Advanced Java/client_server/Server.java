import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws Exception {
        
        ServerSocket ss = new ServerSocket(1111);

        System.out.println("Waiting for client connect.");
        
        Socket s = ss.accept();

        System.out.println("Connected...");

        FileInputStream fin = new FileInputStream("send.txt");
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        int r;
        while((r = fin.read()) != -1){
            dout.write(r);
        }
        System.out.println("File Transfer Completed...");
        s.close();
        ss.close();
    }
}