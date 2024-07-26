import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap활용하기 
class Account {
	String id; // 논리적으로 구별하기 좋은 변수를 키로 가져가는것이 일반적
	String name;
	Integer balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param balance
	 */
	public Account(String id, String name, Integer balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the balance
	 */
	public Integer getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<String, Account> hs = new HashMap<>();
		// HashMap<키타입,값타입>//////
		hs.put("1001", new Account("1001", "hong", 100000));
		hs.put("1002", new Account("1002", "song", 200000));
		hs.put("1003", new Account("1003", "tong", 300000));
		hs.put("1004", new Account("1004", "gong", 400000));
		hs.put("1005", new Account("1005", "bong", 500000));

		// System.out.println(hs);

		// key값으로 value가져오기
		Account account = hs.get("1003");
		System.out.println(account);

		// key값이 있는지 확인하기
		boolean check = hs.containsKey("1006");
		// System.out.println(check);

		// key값이 없으면 value 추가하기
		if (hs.containsKey("1006") == false) {
			hs.put("1006", new Account("1006", "wong", 600000));
		}

		// System.out.println(hs.get("1006"));
		hs.remove("1006");
		// System.out.println(hs.get("1006"));

		// key 목록 가져오기
		// Set타입 이라서 순서가 없음
		Set kSet = hs.keySet();
		// System.out.println(kSet);

		// value목록 가져오기
		Collection<Account> vsCollections = hs.values();
		// System.out.println(vsCollections);
		for (Account ac : hs.values()) {
			//System.out.println(ac);
		}
		for (String keyString : hs.keySet()) {
			//System.out.println(keyString);
		}
		
		
		hs.values().iterator();
		hs.keySet().iterator();
		
		for (Map.Entry<String, Account> entry : hs.entrySet()) {
			//System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
