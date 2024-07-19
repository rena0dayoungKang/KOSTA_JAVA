//업캐스팅 시 Instanceof연산자의 사용 

class Parent {
	
}

class Child extends Parent {
	
}


public class InstanceOfTest {

	public static void main(String[] args) {
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Child child = new Child();
		
		System.out.println(parent1 instanceof Parent);  
		System.out.println(parent2 instanceof Child); //
		System.out.println(parent2 instanceof Parent);//** 
		System.out.println(child instanceof Parent);  //** 
		System.out.println(child instanceof Child);   //
		
		Parent[] pList = new Parent[5];
		pList[0] = new Parent();
		pList[1] = new Child();
		pList[2] = new Parent();
		pList[3] = new Child();
		pList[4] = new Parent();
		
		//1. child만 걸러내기
		int childCnt = 0;
		for (int i = 0; i < pList.length; i++) {
			if (pList[i] instanceof Child) childCnt++;
		}
		System.out.println(childCnt);
		
		//2. parent만 걸러내기
		int parentCnt = 0;
		for (int i = 0; i < pList.length; i++) {
			if (!(pList[i] instanceof Child)) parentCnt++;
		}
		System.out.println(parentCnt);
		
		//3. parent만 걸러내기 
		int parentCnt2 = 0;
		for (int i = 0; i < pList.length; i++) {
			if (pList[i] instanceof Parent) parentCnt2++;
		}
		System.out.println(parentCnt2);
		//이렇게 parent만 걸러내면 5개 모두다 출력됨 
		//왜냐하면 Parent의 instance는 parent도 되고, child도 되기 때문이다. 
		//그래서 child가 false인 것을 찾아야 하는 것이다. 
	}

}
