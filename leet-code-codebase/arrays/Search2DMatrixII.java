public class Search2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (target < matrix[row][col])
                col--;
            else
                row++;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Search2DMatrixII obj = new Search2DMatrixII();

        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int target1 = 5;
        int target2 = 20;

        System.out.println("Target " + target1 + " found: " + obj.searchMatrix(matrix, target1));
        System.out.println("Target " + target2 + " found: " + obj.searchMatrix(matrix, target2));
    }
}
