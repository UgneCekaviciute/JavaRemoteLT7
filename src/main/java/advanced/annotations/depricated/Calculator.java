package advanced.annotations.depricated;

import java.util.List;

public class Calculator {
    //V1 - įsivaizduojam, kad kuriama aplikacija, kuri atlieka matematinius skaičiavimus
//šiuo atveju sudeda du skaičius
    @Deprecated //naudojama kai norim šio metodo ateityje nebetaikyti
    public int sum(int firstNum, int secondNum){
        return firstNum + secondNum;
    }
    //V2 - norim, kad aplikacija sudėtų skaičių sąrašą, o ne tik du skaičius
    public int sum(List<Integer> numbers){
        int result = 0;

        for (Integer number : numbers){ //sukuriamas ciklas, kuris sudės visus skaičius iš sąrašo
            result += number;
        }
        return result;
    }
}
