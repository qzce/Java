import java.util.ArrayList;

/*
 * �����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�.
 * �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��,
���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.

����� ��

answers			return
[1,2,3,4,5]		[1]
[1,3,2,4,2]		[1,2,3]

����� �� ����
����� �� #1

������ 1�� ��� ������ �������ϴ�.
������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

����� �� #2

��� ����� 2�������� ������ϴ�.
 * 
 * 
 */
public class SolveProblem {

	public static void main(String[] args) {
		int[] answers= {4,4,4,2,3};
		for(int i : solve(answers)) {
			System.out.println(i);
		}
	}
	public static int[] solve(int[] answers) {
		int[] one 	= {1,2,3,4,5};
		int[] two 	= {2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5};
		int coOne=0;
		int coTwo=0;
		int coThree=0;
		int[] arr= new int[3];
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == one[i%5]) {
				coOne++;
			}
			if(answers[i] == two[i%8]) {
				coTwo++;
			}
			if(answers[i] == three[i%10]) {
				coThree++;
			}
		}
		arr[0]=coOne;
		arr[1]=coTwo;
		arr[2]=coThree;
		int temp=0;
		
		if(coOne>=coTwo) {
			temp=coOne;
		}else if(coOne<coTwo) {
			temp=coTwo;
		}
		
		if(temp<coThree) {
			temp=coThree;
		}
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		if(temp==coOne) {
			list.add(1);
		}
		if(temp==coTwo) {
			list.add(2);
		}
		if(temp==coThree) {
			list.add(3);
		}
		
		int[] answer=new int[list.size()];
		int length=0;
		for(int i : list) {
			answer[length++]=i;
		}
		
		return answer;
	}
}
