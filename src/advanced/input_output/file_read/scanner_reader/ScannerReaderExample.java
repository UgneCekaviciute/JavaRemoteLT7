package advanced.input_output.file_read.scanner_reader;

import advanced.input_output.InputOutputUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReaderExample {

    public static void main(String[] args) {
        //nuoroda į Data.txt failą paimama iš sukurtos klasės InputOutputUtils
        try (Scanner scanner = new Scanner(new File(InputOutputUtils.DATA_FILE_LOCATION))){ //skanner objektas padeda paimti file
            // objektą ir nuskaityti ekrane, file objektas nuskaito data.txt turinį
            while (scanner.hasNext()){ //tikrinam ar nuskaityta eilutė nėra null
                System.out.println(scanner.nextLine()); //spausdinam tekstą iš data.txt failo
            }
        } catch (IOException ex) {
            System.out.println("Blogas failo formatas arba failas nebuvo rastas");
            System.out.println(ex.getMessage());
        }
    }
}
