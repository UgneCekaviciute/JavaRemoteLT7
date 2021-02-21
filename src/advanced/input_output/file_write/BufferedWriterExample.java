package advanced.input_output.file_write;

import advanced.input_output.InputOutputUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(InputOutputUtils.RESULT_FILE_LOCATION))) {
            String text = "Šiandien yra sekmadienis \nlauke apsiniaukę \npliusinė temperatūra";
            bufferedWriter.write(text); //programa sukurs Results.txt failą, kuriame bus rašomas tekstas
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
