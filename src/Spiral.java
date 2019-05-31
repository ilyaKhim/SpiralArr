import java.util.Arrays;

public class Spiral {
    static final int SIZE = 5;


    public static int[][] fillArr(){
        int[] numbers = new int[SIZE*SIZE];
        for(int i = 0; i<numbers.length;i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));

        int[][] arr = new int[SIZE][SIZE];
        int count = 0;

            for (int i = 0, j = 0; i < SIZE; i++, count++) {
                arr[j][i] = numbers[count];
                if (i == SIZE - 1) {
                    for (; j < SIZE; j++, count++) {
                        arr[j][i] = numbers[count];
                        if (j == SIZE - 1) {
                            for (; i >= 0; i--, count++) {
                                arr[j][i] = numbers[count];
                                if (i == 0) {
                                    for (; j > 0; j--, count++) {
                                        arr[j][i] = numbers[count];
                                        if (j == 1) {
                                            for (; i < SIZE - 1; i++, count++) {
                                                arr[j][i] = numbers[count];
                                                if (i == SIZE - 2) {
                                                    for (; j < SIZE - 1; j++, count++) {
                                                        arr[j][i] = numbers[count];
                                                        if (j == SIZE - 2) {
                                                            for (; i > 0; i--, count++) {
                                                                arr[j][i] = numbers[count];
                                                                if (i == 1) {
                                                                    for (; j > 1; j--, count++) {
                                                                        arr[j][i] = numbers[count];
                                                                        if (j == 2) {
                                                                            for (; i < 3; i++, count++) {
                                                                                arr[j][i] = numbers[count];

                                                                                if (count == numbers.length - 1) {
                                                                                    return arr;
                                                                                }
                                                                            }

                                                                        }
                                                                    }

                                                                }
                                                            }

                                                        }
                                                    }

                                                }
                                            }

                                        }
                                    }

                                }
                            }

                        }
                    }


                }
            }

        return null;
    }


    public static void main(String[] args) {
        int[][] arr = fillArr();
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
}
