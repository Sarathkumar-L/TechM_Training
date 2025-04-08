import java.io.*;
public class Java_practice_task3 {

    public static void main(String[] args) throws IOException {
        inputUsingBuffer();
    }
    static void inputUsingBuffer() throws IOException {
        // Enter data using BufferReader
        BufferedReader bufferr = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the input:");
        // Reading data using readLine
        String s_one = bufferr.readLine();
        int i = Integer.parseInt(bufferr.readLine());
        float f_1= Float.parseFloat(bufferr.readLine());
        // Printing the read line
        System.out.println("The given input String :"+s_one);
        System.out.println("The given input integer:"+i);
        System.out.println("The given input float  :"+f_1);
    }

}
