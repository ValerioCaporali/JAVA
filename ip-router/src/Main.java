import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.ArrayList;

public class Main{

    public static ArrayList<InetAddress> findLanMachines() throws IOException{

        String ip = "192.168.1.";
        ArrayList<InetAddress> lanMachines = new ArrayList<>();

        for (int i = 1; i < 255; i++){

            InetAddress a = InetAddress.getByName(ip + i);
            if(a.isReachable(200)){
                System.out.println("Host name: " +a.getHostName());
                System.out.println("IP: " +a.getHostAddress());
                lanMachines.add(a);
            }

        }

        return lanMachines;
    }

    public static void main(String[] args) {

        try{
            for(InetAddress a : findLanMachines()){

            }
        }

        catch (IOException e){

        }
    }

}
