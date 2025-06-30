import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {
    static final int P = 5000;
    static final List<String> R = Arrays.asList(
        "Interessante... pode me contar mais?",
        "Por que você acha isso?",
        "Como isso faz você se sentir?",
        "Você sempre pensou assim?",
        "O que você gostaria de mudar nessa situação?",
        "Isso já aconteceu antes? Como você lidou?",
        "O que você espera que aconteça a seguir?",
        "Como posso te ajudar com isso?",
        "Você já conversou com alguém sobre isso?",
        "O que mais está passando pela sua cabeça agora?"
    );
    static final Random rand = new Random();

    public static void main(String[] a) throws IOException {
        ServerSocket s = new ServerSocket(P);
        while (true) {
            Socket c = s.accept();
            System.out.println("Cliente: " + c.getInetAddress().getHostAddress());
            new Thread(() -> {
                try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
                    PrintWriter out = new PrintWriter(c.getOutputStream(), true)
                ) {
                    String m;
                    while ((m = in.readLine()) != null && !m.equalsIgnoreCase("sair"))
                        out.println(R.get(rand.nextInt(R.size())));
                } catch (IOException e) {}
                try { c.close(); } catch (IOException e) {}
            }).start();
        }
    }
} 