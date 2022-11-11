
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //String hostName = args[0];
        //int portNumber = Integer.parseInt(args[1]);
        String hostName = "127.0.0.1";
        int portNumber = 80;
        String message[] = {"Student Odobasian Iulian ATM 25 2",
                "Student Chiriches Augustin ASE 20 1",
                "Student Macelaru Andreea ATM 23 3",
                "Profesor Morariu Marian ATM 44 Betoare3",
                "Profesor Bavarescu Maria UNAP 30 Securitate_si_incredere"};
        try {
            Socket me = new Socket(hostName, portNumber);
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Trimit mesajul cu numarul " + i);
                PrintWriter out = new PrintWriter(me.getOutputStream(), true);
                out.println(message[i]);
                Thread.sleep(1000);
                if(i == 4)
                    out.println("Bye.");
            }

        } catch (IOException e){
            e.printStackTrace();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}