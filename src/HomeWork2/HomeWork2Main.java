package HomeWork2;


import jdk.nashorn.internal.runtime.arrays.ArrayData;

public class HomeWork2Main {
    public static void main(String[] args) {
        String[][] mas = new String[][] {{"1","2","3","4"},{"1","4","2","20"},{"1","3","10","4"},{"5","3","1","10"}};
       try {
           try {
               int result = method(mas);
               System.out.println(result);
           } catch (MyArraySizeException e){
               System.err.println("Размер массива не равен 4");
           }
       } catch (MyArrayDataException e) {
           System.err.println("Неправильное значение массива");
           System.err.println("Ошибка в яйчейке: " + e.i + ":"+ e.j);
       }

    }

    static int method (String[][] arr ) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4){
                    throw new MyArraySizeException();
                }
                for (int j = 0; j < arr.length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i,j);
                    }
                }
            }
        }
        return sum;
    }
}
