public class Main {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};

        int suma = 0;

        for (int i = 0; i <= numbers.length - 1; i++){
            suma = suma + numbers[i];
            i++;
        }
        System.out.println(suma);
    }
}
