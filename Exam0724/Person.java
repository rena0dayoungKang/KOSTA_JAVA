class Person implements Cloneable, Comparable<Person> {
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() { //
		return "이름 :" + name + ", 나이 :" + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false)
			return false;
		Person p = (Person) obj; // 다운캐스팅
		return age == p.age && name == p.name;
	}

	@Override
	public int hashCode() {
		return age + name.hashCode();
	}

	@Override
	protected Object clone() { // class에 implements Cloneable해주어야 한다~!
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public int compareTo(Person o) { //TreeSet 구조에서 사용 
		// 크기 비교 함수 오버라이딩
		// 앞 것이 크면 양수, 얖 것이 작으면 음수, 같으면0
		// 1. 나이순
		return age - o.age;
		// 1-2. 나이 내림차순
		//return o.age - age;

		// 2. 이름순
		// return name.compareTo(o.name);
	}
}
