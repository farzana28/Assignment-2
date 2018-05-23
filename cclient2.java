//Example a client  given  any value and server return its square..

import java.net.InetAddress;

import java.net.Socket;

import java.io.*;

public class client2

{

 private static Socket cs;

 public static void main(String args[])throws IOException

  {

	try

	{

	while(true)

	{

		

        cs = new Socket("localhost",9090);

		BufferedReader kb = new BufferedReader(new 
InputStreamReader(System.in));

		BufferedReader br = new BufferedReader(new 
InputStreamReader(cs.getInputStream()));

		DataOutputStream dos = new 
DataOutputStream(cs.getOutputStream());

 

		System.out.println("Enter value ...");

		String s1,s4; 

	while(!(s1=kb.readLine()).equals("exit"))

	{

		System.out.println(" Data  send to server machine");

	 	dos.writeBytes(s1+"\n");

				

		s4 = br.readLine();

		System.out.println(" Square of Given Value is : " +s4);

		System.out.println("Enter Value .. otherwise type exit");

		s1=null;

	}

		System.out.println("Terminated..");

		

		cs.close(); 

		dos.close();

		kb.close();

		break;

        }

	}

		catch(Exception e)

		{

                 e.printStackTrace();

                }

      

   }

}

