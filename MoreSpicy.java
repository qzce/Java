import java.util.Arrays;

/*
 * ���� ����
�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�.
��� ������ ���ں� ������ K �̻����� ����� ���� Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.

���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)

Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.
Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��,
��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
scoville�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
K�� 0 �̻� 1,000,000,000 �����Դϴ�.
scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�.
��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1�� return �մϴ�.

����� ��
scoville	K	return
[1, 2, 3, 9, 10, 12]	7	2
����� �� ����
���ں� ������ 1�� ���İ� 2�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
���ο� ������ ���ں� ���� = 1 + (2 * 2) = 5
���� ������ ���ں� ���� = [5, 3, 9, 10, 12]

���ں� ������ 3�� ���İ� 5�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
���ο� ������ ���ں� ���� = 3 + (5 * 2) = 13
���� ������ ���ں� ���� = [13, 9, 10, 12]

��� ������ ���ں� ������ 7 �̻��� �Ǿ��� �̶� ���� Ƚ���� 2ȸ�Դϴ�.
 */

public class MoreSpicy {
	public static void main(String[] args) {
		int[] scoville= {1,2,3,5,7};
		int K=7;
		System.out.println(scoville(scoville, K));
	}
	public static int scoville(int[] scoville,int K) {
		int answer=0;
		int length=scoville.length;
		int cnt=0;
		boolean chk=true;
		
		int[] beforeArr = new int[length];
		for(int i=0; i<length; i++) {
			beforeArr[i]=scoville[i];
		}
		int[] afterArr = new int[length-1];
		//�迭 ���̰� 1�϶�...
		while(chk) {
			if(length==1) {
				if(beforeArr[0]>=K) {
					answer=0;
				}else if(beforeArr[0]<K) {
					answer=-1;
				}
				chk=false;
			}else if(length>1) {
				if(cnt>0) {
					beforeArr = new int[length];
					for(int i=0; i<length; i++) {
						beforeArr[i]=afterArr[i];
					}
					afterArr = new int[length-1];
				}
				afterArr[0]=beforeArr[0]+(beforeArr[1]*2);
				for(int i=1; i<afterArr.length; i++) {
					afterArr[i]=beforeArr[i+1];
				}
				Arrays.sort(afterArr);
				length--;
				cnt++;
				answer++;
				for(int i=0; i<afterArr.length;i++) {
					if(afterArr[i]<K) {
						chk=true;
						break;
					}else {
						chk=false;
					}
				}
			}
		}
		return answer;
	}
}
