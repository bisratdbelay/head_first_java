package head_first_java;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class MusicServer {
final static List<ObjectOutputStream> clientOutputStreams = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicServer().go();
	}
	
	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			ExecutorService threadPool = Executors.newCachedThreadPool();
			
			while (!serverSock.isClosed()) {
				Socket clientSocket = serverSock.accept();
				ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
				clientOutputStreams.add(out);
				
				ClientHandler clientHandler = new ClientHandler(clientSocket);
				threadPool.execute(clientHandler);
				System.out.println("Got a connection");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void tellEveryone(Object one, Object two) {
		for (ObjectOutputStream clientOutputStream: clientOutputStreams) {
			try {
				clientOutputStream.writeObject(one);
				clientOutputStream.writeObject(two);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
