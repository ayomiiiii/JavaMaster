import java.util.ArrayList;

public class test0703 {

	public static void main(String[] args) {
		ArrayList<String> cats=new ArrayList<String>();
		cats.add("�����1");
		cats.add("�����2");
		cats.add(1,"�����3"); //�ε��� 0�� 2���̿� �߰�
		System.out.println(cats);
		
		cats.remove(0);//�ε��� 0 ���� ����
		System.out.println(cats);
		System.out.println("�ε��� ũ��: "+cats.size());//�ε��� ũ�� ���
		
		System.out.println(cats.contains("��ɤ���1"));//�ε����� '��ɤ���1'�� ������ true, ������ false
		System.out.println(cats.indexOf("�����2"));//�ε����� '�����2'�� ������ 0, ������ -1
		
		cats.clear();//��� �ε��� ���� 
		System.out.println(cats);
		
	}

}
