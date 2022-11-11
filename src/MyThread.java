import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    Socket mySocket;
    BufferedReader in;
    PrintWriter out;


    public MyThread(Socket mySocket,BufferedReader in,PrintWriter out)
    {
        this.mySocket = mySocket;
        this.in = in;
        this.out = out;
    }

    @Override
    public void run()
    {
        ArrayList<Human> listaOameni = new ArrayList<Human>();
        try
        {

            String inputLine;
            while((inputLine = in.readLine())!= null)
            {
                if(inputLine.equals("Bye."))
                    break;
                else
                {
                    String split[] = inputLine.split(" ");
                    if(split[0].equals("Student"))
                        listaOameni.add(new Student(split[1], split[2], split[3], Integer.parseInt(split[4]), Integer.parseInt(split[5])));
                    else if (split[0].equals("Profesor"))
                        listaOameni.add(new Profesor(split[1], split[2], split[3], Integer.parseInt(split[4]), split[5]));
                }
            }

            Collections.sort(listaOameni);

            for(Human h : listaOameni)
                System.out.println(h.toString());


        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
