package tst;

import java.util.Scanner;

public class SugarDeliver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, kg_5, kg_3;
		N = sc.nextInt(); //��ü kg
		kg_3 = 0; // 3kg�� ���� ���� ����
		if(N<3||N>5000) {
			System.out.println(-1); //3�̸� 5000�ʰ��� �ȵ�
		}
		else {
			while(N%5!=0) { // 5�� ����� ���ö����� �ݺ�
				N = N-3; // 3�� �ѹ��� ����
				kg_3++; // 3kg�� ���� ������ ���� �ϳ��� ������
				if(N<5 & N!=0 & N!=3) { // 0��3�� �ƴ� 5������ �ڿ������� ��
					break;
				}
			}
			kg_5 = N/5;
			if(N<5 && N>0) {
				System.out.println(-1);
			}
			else {
			System.out.println(kg_5 + kg_3);
			}
		}
	}
}
/* 5�� ���� ����� ������ ������
 * ��ü���� 3���� �ϳ��� ���鼭 5�ǹ���� �����ϸ� �ּҺ��� ������ �ȴ�.
 * 
 * */
