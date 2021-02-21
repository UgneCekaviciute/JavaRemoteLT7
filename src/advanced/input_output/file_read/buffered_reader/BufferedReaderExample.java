package advanced.input_output.file_read.buffered_reader;

import advanced.input_output.InputOutputUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    //nurodom kelią iki Data.txt failo (ant Data.txt - dpk, copy path, absolut path)
    //private static final String DATA_FILE_LOCATION = "C:\\Users\\ugnec\\IdeaProjects\\Paskaitos\\JavaFundamentals\\src\\advanced\\input_output\\Data.txt";

    public static void main(String[] args) {
        //sukuriam failus bufferedReader ir fileReader ir įdedam konstantą
        try { //kadangi gali būti išimčių, kai failas bus ištrintas ir jo negalima rasti, rašom try ir catch
            FileReader fileReader = new FileReader(InputOutputUtils.DATA_FILE_LOCATION); //importuojamas
            BufferedReader bufferedReader = new BufferedReader(fileReader); //importuojamas

            //kad spausdintų visą tekstą:
            String line;
            do {
                line = bufferedReader.readLine();
                //kad nespausdintų null parašom if sąlygą:
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null); //bus skaitomas tekstas iš Data.txt kol nueis iki pabaigos

            //spausdinam BufferedReader turinį, kuris gaunamas iš Data.txt failo. Atspausdins tik pirmą eilutę
            //System.out.println(bufferedReader.readLine());

            //nuskaičius failą reikia jį uždaryti, nes tik viena programa gali naudotis atidarytu failu
            bufferedReader.close();
        } catch (FileNotFoundException ex){ //turi būti importuojamas. Catch blokai gali būti keli
            System.out.println("Failas nebuvo rastas pagal nurodytą kelią: " + InputOutputUtils.DATA_FILE_LOCATION);//spausdinamas
            //tekstas, jei nurodytas kelias bus neteisingas;
            //kitas spausdinimo būdas:
            System.out.println(ex.getMessage()); //kreipiamės į klaidos objektą
            // FileNotFoundException, kad atspasudintų žinutę
        } catch (IOException ex){ //input output exception, kad patikrintų failo formatą
            System.out.println("Blogas failo formatas");
            System.out.println(ex.getMessage());
        }
        //kitas pvz su try ir catch:
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch (ArithmeticException arEx){
            System.out.println("Buvo atlikta dalyba iš nulio");//arba
            System.out.println(arEx.getMessage());
        }
    }
}
