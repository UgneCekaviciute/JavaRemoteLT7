package advanced_homework.nd1.uzduotis2;

public class Uzduotis2 {
    //Susikurti objektą "Dog", su laukais: "name", "age", "color"
    //    * Inicializuoti 3 "Dog" objektus;
    //    * Objektai turi būti saugojami masyve;
    //    * Sukurti metodą vyriausio šuns radimui ir jo vardo išspausdinimui;
    //    * Sukurti metodą šunų vidutiniam amžiui rasti.

    public static void main(String[] args) {
        Dog dog1 = new Dog ("Amsis", 5, "juoda");
        Dog dog2 = new Dog ("Pupsis", 10, "marga");
        Dog dog3 = new Dog ("Mopsis", 4, "balta");

        String [][] array = new String [3][3];
        array [0] = new String[]{String.valueOf(dog1)};
        array [1] = new String[]{String.valueOf(dog2)};
        array [2] = new String[]{String.valueOf(dog3)};

        int biggestAge = 0;
        for (int i = 0; i<= array.length; i++){
            //if (){

            }
        }
   // }
    public void oldest (){

    }
}
