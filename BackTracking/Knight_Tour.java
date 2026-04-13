class Solution {
  public boolean check(int[][] grid, int row, int col, int num) {
    int n = grid.length;
    if (num == n * n - 1)
      return true;
    int i, j;
    // check 2 up 1 right
    i = row - 2;
    j = col + 1;
    if (i >= 0 && j < n && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);
    // check 2 up 1 left
    i = row - 2;
    j = col - 1;
    if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);
    // check 2 Down 1 right
    i = row + 2;
    j = col + 1;
    if (i < n && j < n && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);
    // check 2 Down 1 Left
    i = row + 2;
    j = col - 1;
    if (i < n && j >= 0 && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);
    // check 2 right 1 up
    i = row - 1;
    j = col + 2;
    if (i >= 0 && j < n && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);
    // check 2 right 1 Down
    i = row + 1;
    j = col + 2;
    if (i < n && j < n && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);
    // check 2 Left 1 up
    i = row - 1;
    j = col - 2;
    if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);
    // check 2 Left 1 Down
    i = row + 1;
    j = col - 2;
    if (i < n && j >= 0 && grid[i][j] == num + 1)
      return check(grid, i, j, num + 1);

    return false;
  }

  public boolean checkValidGrid(int[][] grid) {
    if (grid[0][0] != 0)
      return false;

    return check(grid, 0, 0, 0);
  }
}

public class Knight_Tour {
  public static void main(String[] args) {
    Solution obj = new Solution();
    int[][] arr = { { 0, 11, 16, 5, 20 }, { 17, 4, 19, 10, 15 },
        { 12, 1, 8, 21, 6 },
        { 3, 18, 23, 14, 9 }, { 24, 13, 2, 7, 22 } };
    System.out.println(obj.checkValidGrid(arr));
  }
}
