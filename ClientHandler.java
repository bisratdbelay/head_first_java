package head_first_java;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {

	private ObjectInputStream in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public ClientHandler(Socket socket) {
		try {
			in = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		Object userName;
		Object beatSequence;
		
		try {
			while ((userName = in.readObject()) != null);
			beatSequence = in.readObject();
			
			System.out.println();
			MusicServer.tellEveryone(userName, beatSequence);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
