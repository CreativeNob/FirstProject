/**
 * Write an algorithm to print all ways of arranging eight queens
 * on an 8x8 chess board so that none of them share the same row,
 * column or diagonal. In this case, "diagonal" means all diagonals,
 * not just the two that bisect the board.
 */
 /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {

	public static int countPaths(int[][] target, int n, int row, int col){

		if (n == 1)
		return 2;

		int innerCount = 0;

		if (target[row][col+1] == 0)
		innerCount += countPaths(target, n-1, row, col+1);

		if (target[row+1][col] == 0)
		innerCount += countPaths(target, n-1, row+1, col);

		return innerCount;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] grid = new int[3][3];
		int pathNum = countPaths(grid, 3, 0, 0);
		System.out.print(pathNum);

	}

}
