package Week_3.GenericMetot;

public class GenericMetotYazimi {

    public static <T> void printArray(T[] array) {
        // Generic metot: T tipinde bir dizi alir ve elemanlari yan yana yazdirir
        for(T element : array){
            System.out.print(element + " "); // her elemandan sonra bir bosluk
        }
        System.out.println(); // satir sonu

    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"Java","Generics","odevii"};

        printArray(intArray);
        printArray(strArray);
    }

}
