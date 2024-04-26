class squarematrixmaindiagnol{
    public static void main(String[] args){
        int matrix[][] = new int[5][5], row_index, column_index, x= 0, size = 5;
        for (row_index = 0; row_index < size; row_index++){
            for (column_index = 0; column_index < size; column_index++){
                matrix[row_index][column_index] = ++x;
            }
        }

        System.out.printf("The matrix is \n ");
        for (row_index = 0; row_index < size; row_index++){
            for (column_index = 0; column_index < size; column_index++){
                System.out.printf("%d\t", matrix[row_index][column_index]);
            }
            System.out.printf("\n");
        }
        System.out.printf("Main diagonal elements are : \n");

        for (row_index =0; row_index < size; row_index++){
            for (column_index = 0; column_index < size; column_index++){
                if (row_index == column_index){
                    System.out.printf("%d,", matrix[row_index][column_index]);
                }
            }
        }
    }
}