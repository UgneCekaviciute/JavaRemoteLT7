package fundamentals_coding.uzduotis2;

public class Uzduotis2 {
    //Write an application calculating BMI (Body Mass Index) and checking if it’s optimal
// or not. Your application should read two variables: weight (in kilograms, type float)
// and height (in centimeters, type int). BMI should be calculated given following formula
//The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
// Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.
    public static void main(String[] args) {
        float weightInKilograms = 53.0f;
        int heightInCentimeters = 162;
        float heightInMeters = (float) heightInCentimeters/100;
        float BMI = weightInKilograms/(heightInMeters*heightInMeters);

        if (BMI>=18.5 && BMI<= 24.9){
            System.out.println("BMI optimal");

        } else {
            System.out.println("BMI not optimal");
        }
    }
}
