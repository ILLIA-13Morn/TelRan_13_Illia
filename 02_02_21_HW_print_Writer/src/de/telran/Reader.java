package de.telran;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine());

        while (true)
        {

            String data = reader.readLine();
            if(data.equals("exit")){
                outputStream.write(data.getBytes());
                break;
            }
            else {
                outputStream.write((data +"\r\n").getBytes());
            }
        }
        outputStream.close();
        reader.close();
    }
}
