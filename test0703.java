import java.util.ArrayList;

public class test0703 {

	public static void main(String[] args) {
		ArrayList<String> cats=new ArrayList<String>();
		cats.add("고냥이1");
		cats.add("고냥이2");
		cats.add(1,"고냥이3"); //인덱스 0과 2사이에 추가
		System.out.println(cats);
		
		cats.remove(0);//인덱스 0 내용 삭제
		System.out.println(cats);
		System.out.println("인덱스 크기: "+cats.size());//인덱스 크기 출력
		
		System.out.println(cats.contains("고냥ㅇ이1"));//인덱스에 '고냥ㅇ이1'이 있으면 true, 없으면 false
		System.out.println(cats.indexOf("고냥이2"));//인덱스에 '고냥이2'이 있으면 0, 없으면 -1
		
		cats.clear();//모든 인덱스 삭제 
		System.out.println(cats);
		
	}

}
