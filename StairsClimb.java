package tst;

import java.util.Scanner;

public class StairsClimb {
	
	public static void main(String[] args) {
		int N; // ��ü ��� ��
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		int[] max_sum = new int[N]; // ���� ��� ��
		int[] stair = new int[N]; // �� ��ܴ� ��

		for(int i = 0; i<N; i++) {
			stair[i] = sc.nextInt();
		}

		max_sum[0] = stair[0]; // 1��� ��
		max_sum[1] = stair[0] + stair[1]; // 1, 2 ��� ��
		max_sum[2] = Math.max(stair[0] + stair[2] , stair[1] + stair[2]); //1,3 or 2,3��� �� �ִ밪

		for(int i = 3; i<N; i++) {
			max_sum[i] = Math.max(max_sum[i-3] + stair[i-1] + stair[i], max_sum[i-2] + stair[i]);
		} // N-2 ��ܿ��� N���� �� (N-2��ܱ����� �� + N����� ��) or N-1 ��ܿ��� N���� �� (N-3��ܱ����� �� + N-1����� �� + N����� ��) �� �ִ밪
		System.out.println(max_sum[N-1]);
	}
}