/*
----------------
��������������
----------------
����(1) ����(2) ��(3) ����(0)>1
COM : ����
YOU : ����
��� : �����ϴ�.

*/


class Rock_scissors_paper{

   public static void main(String[] args){
	
	System.out.println("-------------------------");
	System.out.println("����,����,�� ����");
	System.out.println("-------------------------");
	
	boolean result = true;

	while(result){
		double ran = Math.random();	
		int a = (int)(ran*3.0);
		
		System.out.print("����(1) ����(2) ��(3) ����(0)>");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int i = sc.nextInt();
		if(i==0){
			System.out.print("�̿����ּż� �����մϴ�.");
			break;
		}
		System.out.print("COM : ");
		switch(a){
			case 0:
				System.out.println("����");
				break;
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("��");
				break;
			default:
				System.out.println("����");
		}

		System.out.print("YOU : ");
		switch(i){
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("��");
				break;
			default:
				System.out.println("�߸��Է�");
		}
	System.out.print("��� : ");
	if(i==1 && a==1)
		System.out.println("�����ϴ�.");
	else if(i==1 && a==2)
		System.out.println("�̰���ϴ�.");
	else if(i==2 && a==0)
		System.out.println("�̰���ϴ�.");
	else if(i==2 && a==2)
		System.out.println("�����ϴ�.");
	else if(i==3 && a==0)
		System.out.println("�����ϴ�.");
	else if(i==3 && a==1)
		System.out.println("�̰���ϴ�.");
	else
		System.out.println("�����ϴ�.");

	}

   }


}