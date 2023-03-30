import java.net.*;
import javax.swing.*;

public class UDPclient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            byte[] sendData = new byte[1024];
            InetAddress IPAddress = InetAddress.getByName("localhost");
            while (true) {
                String sentence = JOptionPane.showInputDialog("Digite");
                sendData = sentence.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sentence.length(), IPAddress, 4000);
                clientSocket.send(sendPacket);
                if (sentence.equals("fim")) {
                    break;
                }
            }
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Erro encontrado");
        }
    }
}
