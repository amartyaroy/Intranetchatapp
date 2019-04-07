import java.util.*;
import java.net.*;
import java.io.*;

public class ClientTCP{
        public static void main(String args[]) throws IOException
        {
                Scanner ip = new Scanner(System.in);
                while(true)
                {
                        String str;
                        str = ip.nextLine();
                        Socket client;
                        client = new Socket("127.0.0.1",5000);
                        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                        dos.writeUTF(str);
                        dos.close();
                        client.close();
                }
        }
}
