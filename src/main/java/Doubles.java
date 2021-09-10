import java.io.*;
public class Doubles {

    public static void main(String[] args) {
        String file = "src\\main\\java\\input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            int a = Integer.parseInt(reader.readLine());
            int b;
            int c = -1;

                try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\main\\java\\output.txt")))
                {
                    for(int i = 0; i < a; i++){
                        b = Integer.parseInt(reader.readLine());
                        if (b != c) {
                            writer.write(String.valueOf(b) + '\n');
                            c = b;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
