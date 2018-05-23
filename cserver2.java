//Server given a Square  which value taken by  by Client

import java.io.*;

import java.net.ServerSocket;  // server response 

import java.net.Socket;    // client request

public class server2

{	public static Socket ss;

 public static void main(String[] args)throws Exception

 {

    

	ServerSocket srs = new ServerSocket(9090);

	System.out.println("Server is running...");

	ss=srs.accept();

	System.out.println("connection established");



	BufferedReader kb = new BufferedReader(new 
InputStreamReader(System.in));

	BufferedReader br = new BufferedReader(new 
InputStreamReader(ss.getInputStream()));

	DataOutputStream dos = new 
DataOutputStream(ss.getOutputStream());

	while(true)

	{

		System.out.println("server repeat till client not send null");

		String s2,s3; 

		while((s2=br.readLine())!=null)

		{

			System.out.println("Client Value is : "+s2);

			try

			{

				int no = Integer.parseInt(s2);

				int sqrno = no*no;

				s3 = String.valueOf(sqrno) + "\n";

			}

			catch(NumberFormatException e)

			{

            s3 = "Please send a proper number\n";

			}

		dos.writeBytes(s3);

		System.out.println("Answer send to client machine");

	}

	System.out.println("Terminated..");

	ss.close(); 

	srs.close();

	dos.close();

	kb.close();

	System.exit(0);

  }

 }

}
