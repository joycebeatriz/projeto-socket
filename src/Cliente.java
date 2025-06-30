import java.io.*;
import java.net.*;
import java.util.*;

public class Cliente {
    public static void main(String[] a) throws IOException {
        try (
            Socket s = new Socket("localhost", 5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            Scanner sc = new Scanner(System.in)
        ) {
            String m;
            while (true) {
                System.out.print("Você: ");
                m = sc.nextLine();
                out.println(m);
                if (m.equalsIgnoreCase("sair")) break;
                System.out.println("Servidor: " + in.readLine());
            }
        }
    }
} 