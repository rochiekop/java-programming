public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80,98,89,95};
        calculateGrade("Bryan",values);

        calculateGradeArgs("Bryan",values);
        calculateGradeArgs("Bryan",89,70,81);
    }

    /*DO IT use ARRAY*/
    static void calculateGrade(String name, int[] values){
        int sum = 0;
        for (int value: values
             ) {
            sum+=value;
        }

        var average = sum/values.length;

        if(average>=85){
            System.out.println("Your grade is "+average +" Congratzzz "+name+", you pass this exam");
        }else {
            System.out.println("Your grade is "+average +" Sorry "+name+", you didn't pass this exam");
        }
    }

    /*With VARIABLE ARGUMENT*/
    static void calculateGradeArgs(String name, int... values){
        int sum = 0;
        for (int value: values
        ) {
            sum+=value;
        }

        var average = sum/values.length;

        if(average>=85){
            System.out.println("Your grade is "+average +" Congratzzz "+name+", you pass this exam");
        }else {
            System.out.println("Your grade is "+average +" Sorry "+name+", you didn't pass this exam");
        }
    }
}
