public class a100prime {
    public static void main(String[] args) {
        int range = 100;
        boolean prime = true;
        int number = 2;
        while (number < 100){
            for (int index = 2; index <= Math.sqrt(number);index++){
                if (number % index == 0){
                    prime = false;
                }
            }
            if (prime){
                System.out.print(number + " ");
            }
            number++;
            prime = true;
        }
    }
}
