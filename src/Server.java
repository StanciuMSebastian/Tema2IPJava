import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) {
        int port = 80;


    try{
        ServerSocket server = new ServerSocket(port);

        while(true)
        {
            Socket client = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            MyThread thread = new MyThread(client, in, out);
            thread.start();
        }
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}