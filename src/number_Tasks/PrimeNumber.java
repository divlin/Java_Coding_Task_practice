package number_Tasks;

public class PrimeNumber {

    public static void main(String[] args) {


        System.out.println(primeNumber(11));

    }

    public static boolean primeNumber(int num){

        String result = "";

        if (num < 2){
            return false;
        }

        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }

        }
        return true;
    }


}


/*
        Write a method that can check if a number is prime or not
     */