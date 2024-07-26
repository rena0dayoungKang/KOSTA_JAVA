import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age;
	}
}

public class ObjectStreamTest1 {
	public static void save(List<Person> pers) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("pers.bin");
			oos = new ObjectOutputStream(fos);
			//방법1. 어레이리스트 전체 오브젝트로 저장 
			oos.writeObject(pers);
			
			//방법2.
//			oos.writeInt(pers.size());
//			for (Person p : pers) {
//				oos.writeObject(p);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static List<Person> load() {
//		List<Person> pers = new ArrayList<>();
		List<Person> pers = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("pers.bin");
			ois = new ObjectInputStream(fis);
			
			//방법1.
			pers = (ArrayList<Person>)ois.readObject();
			
			//방법2.
//			int cnt = ois.readInt(); // writeInt로 해서 readInt로 해야함
//			for (int i = 0; i < cnt; i++) {
//				pers.add((Person) ois.readObject());
//			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return pers;
	}

	public static void saveOne(Person person) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("per.bin");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(person);
			// java.io.NotSerializableException: Person이 뜬다 그래서
			// Person클래스에 implements Serializable해준다.
			// Object로 파일을 저장할 때는 데이터 값 뿐만아니라 클래스명 등등의 정보도 나온다
			// 클래스별로 데이터값이 엄청 많은 파일을 저장하거나 불러올때유용
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void loadOne() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("per.bin");
			ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			System.out.println(p);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

//		List<Person> pers = new ArrayList<>();
//		pers.add(new Person(20, "홍길동"));
//		pers.add(new Person(30, "김길동"));
//		pers.add(new Person(40, "박길동"));
//		pers.add(new Person(50, "송길동"));
//		pers.add(new Person(10, "하길동"));
//
//		save(pers);
		List<Person> perList = load(); 
		System.out.println(perList);
		// saveOne(new Person(10, "김적극"));
		// loadOne();

	}

}
